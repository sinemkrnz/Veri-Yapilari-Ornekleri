package odev5;

public class bListe {
    Eleman bas;

    public bListe() {
        bas = null;
    }

    public void dereceyeGoreEkle(Eleman yeni) {
        if (bas == null || bas.derece <= yeni.derece) {
            yeni.ileri = bas;
            bas = yeni;

        } else {
            Eleman tmp = bas;
            while (tmp.ileri != null && tmp.ileri.derece > yeni.derece) {
                tmp = tmp.ileri;
            }
            yeni.ileri = tmp.ileri;
            tmp.ileri = yeni;


        }

    }

    public String goster() {
        String s = " ";
        Eleman tmp = bas;
        while (tmp != null) {
            s = s + tmp.katsayi + "x^" + tmp.derece+"+";
            tmp=tmp.ileri;
        }
        return s;
    }

}

