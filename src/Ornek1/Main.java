package odev1;

public class Main {

    public static boolean veriKontrol(String veri) {
        for (int i = 0; i < veri.length(); i++) {
            if (veri.charAt(i) == '0' || veri.charAt(i) == '1') {

            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean uretirMi(String veri) {
        boolean sonuc;
        Stack otomataStacki = new Stack(veri.length());
        int durum = 0;
        if (!veriKontrol(veri)) {
            System.out.println(" Verilen sözcük bu dil tarafından üretilmemistir. ");
            return false;

        } else {
            for (int i = 0; i < veri.length(); i++) {
                if (durum == 0 && veri.charAt(i) == '0') {
                    otomataStacki.ekle('a');
                    durum = 0;
                } else if (durum == 0 && veri.charAt(i) == '1') {
                    otomataStacki.ekle('b');
                    durum = 1;

                } else if (durum == 1 && veri.charAt(i) == '0') {

                    char tutamac = otomataStacki.cikar();
                    if (tutamac == '-') {
                        System.out.println("Verilen sözcük bu dil tarafından üretilmemistir. ");
                        return false;
                    } else if (tutamac == 'b') {
                        durum = 2;
                    } else {
                        System.out.println("Verilen sözcük bu dil tarafından üretilmemistir. ");
                        return false;
                    }
                } else if (durum == 1 && veri.charAt(i) == '1') {
                    otomataStacki.ekle('b');
                    durum = 1;
                } else if (durum == 2 && veri.charAt(i) == '0') {
                    char tutamac = otomataStacki.cikar();
                    if (tutamac == '-') {
                        System.out.println("Verilen sözcük bu dil tarafından üretilmemistir. ");
                        return false;
                    } else if (tutamac == 'b') {
                        durum = 2;
                    } else {
                        System.out.println("Verilen sözcük bu dil tarafından üretilmemistir. ");
                        return false;
                    }
                } else if (durum == 2 && veri.charAt(i) == '1') {
                    char tutamac = otomataStacki.cikar();
                    if (tutamac == '-') {
                        System.out.println("Verilen sözcük bu dil tarafından üretilmemistir. ");
                        return false;
                    } else if (tutamac == 'a') {
                        durum = 3;
                    } else {
                        System.out.println("Verilen sözcük bu dil tarafından üretilmemistir. ");
                        return false;
                    }
                } else if (durum == 3 && veri.charAt(i) == '0') {
                    System.out.println(" Verilen sözcük bu dil tarafından üretilmemistir. ");
                    return false;
                } else if (durum == 3 && veri.charAt(i) == '1') {
                    char tutamac = otomataStacki.cikar();
                    if (tutamac == '-') {
                        System.out.println("Verilen sözcük bu dil tarafından üretilmemistir. ");
                        return false;
                    } else if (tutamac == 'a') {
                        durum = 3;
                    } else {

                        return false;
                    }
                }

            }
            if (otomataStacki.bosMu()) {
                System.out.println("Verilen sözcük bu dil tarafından üretilmistir. ");
                sonuc = true;
            } else {
                System.out.println("Verilen sözcük bu dil tarafından üretilmemistir. ");
                sonuc = false;
            }


        }
        return sonuc;
    }

    public static void main(String[] args) {
        System.out.println(uretirMi("011111111110000000001"));

    }

}
