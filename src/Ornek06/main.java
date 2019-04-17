package odev6;

public class main {
    public static void main(String[] args) {
        Eleman yeni=new Eleman('f');
        Eleman yeni1=new Eleman('k');
        Eleman yeni2=new Eleman('p');
        Eleman yeni3=new Eleman('b');
        Eleman yeni4=new Eleman('t');
        Eleman yeni5=new Eleman('c');
        Eleman yeni6=new Eleman('ş');
        bListe liste=new bListe();
        liste.basaEkle(yeni);
        liste.basaEkle(yeni1);
        liste.sonaEkle(yeni2);
        liste.sonaEkle(yeni3);
        liste.basaEkle(yeni4);
        liste.sonaEkle(yeni5);
        System.out.println(liste.goster());
        System.out.println(liste.elemanSayisi());

        liste.SıradanSil(1);
        System.out.println(liste.goster());

    }
}
