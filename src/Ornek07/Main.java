package odev7;

public class Main {
    public  boolean Kontrol(String veri) {
        boolean sonuc = false;
        Stack kontrolStacki = new Stack(veri.length());
        for (int i = 0; i < veri.length(); i++) {
            char karakter = veri.charAt(i);

            switch (karakter) {
                case '[':
                    kontrolStacki.ekle('a');
                    break;
                case '{':
                    kontrolStacki.ekle('b');
                    break;
                case '(':
                    kontrolStacki.ekle('c');
                    break;
                case ')': {

                    char cikan = kontrolStacki.cikar();
                    if (cikan != 'c') {
                        return false;
                    }
                    break;
                }
                case '}':{

                    char cikan = kontrolStacki.cikar();
                    if (cikan != 'b') {
                        return false;
                    }
                    break;
                }
                case ']':{

                    char cikan = kontrolStacki.cikar();
                    if (cikan != 'a') {
                        return false;
                    }
                    break;

                }
                default:return false;
            }

        }
        if (kontrolStacki.bosMu()){
            sonuc=true;
        }
        else{
            sonuc=false;}
    return sonuc;
    }



    public static void main(String[] args) {
        String ifade = "({()[{}]}))";
        Main nesne = new Main();
        System.out.println(nesne.Kontrol(ifade));

    }
}
