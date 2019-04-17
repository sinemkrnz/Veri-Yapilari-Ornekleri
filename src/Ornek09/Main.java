package odev9;

import java.util.Scanner;

public class Main {
    private boolean karakterMi(char veri) {
        boolean karakter = false;
        if (veri >= 48 && veri <= 57 || veri >= 65 && veri <= 90 || veri >= 97 && veri <= 122) {
            karakter = true;

        } else {
            karakter = false;
        }
        return karakter;
    }

    private int Oncelik(char veri) {
        switch (veri) {
            case '-':
                return 1;
            case '+':
                return 2;
            case '/':
                return 3;
            case '*':
                return 4;
            case '^':
                return 5;


        }
        return -1;
    }

    public String inToPost(String veri) {
        String tutamac = "";
        Stack postfixStacki = new Stack(veri.length());
        for (int i = 0; i < veri.length(); i++) {
            if (karakterMi(veri.charAt(i))) {
                tutamac = tutamac + veri.charAt(i);
            } else if (veri.charAt(i) == '(') {
                postfixStacki.ekle(veri.charAt(i));
            } else if (veri.charAt(i) == ')') {
                while (!postfixStacki.bosMu() && postfixStacki.enUst() != '(') {
                    tutamac += postfixStacki.cikar();
                }
                if (!postfixStacki.bosMu() && postfixStacki.enUst() != '(') {
                    return "gecersiz ifade";

                } else
                    postfixStacki.cikar();
            } else {
                while (!postfixStacki.bosMu() && Oncelik(veri.charAt(i)) <= Oncelik(postfixStacki.enUst())) {
                    tutamac += postfixStacki.cikar();
                }
                postfixStacki.ekle(veri.charAt(i));
            }


        }
        while (!postfixStacki.bosMu()) {
            tutamac += postfixStacki.cikar();
        }
        return tutamac;


    }



    public static void main(String[] args) {
        String veri = "(a+b*c)+(d*e+f)*g";
        Main nesne = new Main();
        System.out.println("postfix=" + nesne.inToPost(veri));

    }


}
