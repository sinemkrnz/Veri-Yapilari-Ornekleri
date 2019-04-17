package odev5;

public class Main {
    public static void main(String[] args) {
        Eleman veri1 = new Eleman(2, 3);
        Eleman veri2 = new Eleman(5, 4);
        Eleman veri3 = new Eleman(9, 7);
        Eleman veri4 = new Eleman(10, 1);
        bListe polinom = new bListe();
        polinom.dereceyeGoreEkle(veri1);
        polinom.dereceyeGoreEkle(veri2);
        polinom.dereceyeGoreEkle(veri3);
        polinom.dereceyeGoreEkle(veri4);


        System.out.println("P(x)=" + polinom.goster().substring(0, polinom.goster().length() - 1));

    }
}
