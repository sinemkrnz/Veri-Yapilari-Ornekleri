package odev2;

public class Kuyruk {
    private int boyut;
    private int bas;
    private int son;
    private int kuyrukDizi[];

    public Kuyruk(int boyut) {
        this.boyut = boyut;
        kuyrukDizi = new int[this.boyut];
        bas = 0;
        son = 0;

    }

    public boolean doluMu() {

        return (bas == (son + 1) % boyut);

    }

    public boolean bosMu() {

        return (bas == son);

    }

    public void kuyrugunaEkle(int veri) {
        if (!doluMu()) {
            kuyrukDizi[son] = veri;
            son = (son + 1) % boyut;

        } else {
            System.out.println("Kuyruk dolu!");
        }
    }

    public int kuyrugundanCikar() {
        int tutamac = 9999;
        if (!bosMu()) {
            tutamac = kuyrukDizi[bas];
            bas = (bas + 1) % boyut;

        } else {
            System.out.println("Kuyruk bos!");
        }
        return tutamac;
    }


}
