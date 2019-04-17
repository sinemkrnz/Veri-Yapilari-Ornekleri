package odev2;

public class Main {

    private Kuyruk[] kuyrukDizisinin;

    public Main(int diziUzunlugu) {
        kuyrukDizisinin = new Kuyruk[10];
        for (int i = 0; i < 10; i++) {
            kuyrukDizisinin[i] = new Kuyruk(diziUzunlugu + 1);
        }
    }

    public int[] radixSiralama(int[] sayilar, int basamak) {
        int k = 0;
        int sonucDizi[] = new int[sayilar.length];


        for (int i = 0; i < sayilar.length; i++) {

            int basamakDegeri = (int) (sayilar[i] / Math.pow(10, basamak - 1)) % 10;
            switch (basamakDegeri) {
                case 0: {
                    kuyrukDizisinin[0].kuyrugunaEkle(sayilar[i]);
                    break;
                }
                case 1: {
                    kuyrukDizisinin[1].kuyrugunaEkle(sayilar[i]);
                    break;
                }
                case 2: {
                    kuyrukDizisinin[2].kuyrugunaEkle(sayilar[i]);
                    break;
                }
                case 3: {
                    kuyrukDizisinin[3].kuyrugunaEkle(sayilar[i]);
                    break;
                }
                case 4: {
                    kuyrukDizisinin[4].kuyrugunaEkle(sayilar[i]);
                    break;
                }
                case 5: {
                    kuyrukDizisinin[5].kuyrugunaEkle(sayilar[i]);
                    break;
                }
                case 6: {
                    kuyrukDizisinin[6].kuyrugunaEkle(sayilar[i]);
                    break;
                }
                case 7: {
                    kuyrukDizisinin[7].kuyrugunaEkle(sayilar[i]);
                    break;
                }
                case 8: {
                    kuyrukDizisinin[8].kuyrugunaEkle(sayilar[i]);
                    break;
                }
                case 9: {
                    kuyrukDizisinin[9].kuyrugunaEkle(sayilar[i]);
                    break;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            while (!kuyrukDizisinin[i].bosMu()) {
                sonucDizi[k] = kuyrukDizisinin[i].kuyrugundanCikar();
                k++;
            }
        }

        return sonucDizi;
    }

    public boolean negatifMi(int[] sayilar) {
        boolean sonuc = false;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] >= 0) {
                sonuc = true;
            } else {
                return false;
            }

        }
        return sonuc;
    }

    public int enBuyuk(int[] sayilar) {
        int enbuyuk = sayilar[0];
        for (int i = 1; i < sayilar.length; i++) {
            if (enbuyuk < sayilar[i]) {
                enbuyuk = sayilar[i];
            }
        }
        return enbuyuk;
    }

    public static void main(String[] args) {
        int sayilar[] = {170, 45, 75, 3585, 354, 2, 1524, 24, 0, 5586, 802, 44444444, 66};

        Main nesne = new Main(sayilar.length);

        if (!nesne.negatifMi(sayilar)) {
            System.out.println("dizide negatif sayi var");
        } else {
            for (int i = 0; i < (String.valueOf(nesne.enBuyuk(sayilar))).length(); i++) {
                sayilar = nesne.radixSiralama(sayilar, i + 1);
            }

            for (int i = 0; i < sayilar.length; i++) {
                System.out.println(sayilar[i]);
            }
        }
    }
}
