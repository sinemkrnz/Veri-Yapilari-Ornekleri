package odev10;

public class Main
{
    public static void main(String[] args) {
        int q=5;
        Kuyruk kuyruk=new Kuyruk(6);
        kuyruk.Ekle(18);
        kuyruk.Ekle(85);
        kuyruk.Ekle(7);
        kuyruk.Ekle(11);
        kuyruk.Ekle(25);
        while (!kuyruk.bosMu()){
            int tutamac=kuyruk.Cikar();
            if (tutamac<q){
                int sonuc=tutamac-q;
                kuyruk.Ekle(sonuc);
            }
        }

    }
}
