package odev3;

public class Ogrenci {
    public String ad;
    public String soyad;
    public int numara;
    Ogrenci sag, sol;

    public Ogrenci(String ad, String soyad, int numara) {
        this.ad = ad;
        this.soyad = soyad;
        this.numara = numara;
        sag = null;
        sol = null;
    }
}
