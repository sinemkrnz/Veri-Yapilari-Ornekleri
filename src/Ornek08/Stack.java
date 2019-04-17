package odev8;

public class Stack {
    private int boyut;
    private int ust;
    private int stackDizi[];


    public Stack(int boyut) {
        this.boyut = boyut;
        stackDizi = new int[this.boyut];
        ust = -1;
    }

    public boolean doluMu() {
        boolean sonuc;
        if (ust == boyut - 1) {
            sonuc = true;
        } else {
            sonuc = false;
        }
        return sonuc;
    }

    public boolean bosMu() {
        boolean sonuc;
        if (ust == -1) {
            sonuc = true;
        } else {
            sonuc = false;
        }
        return sonuc;
    }

    public void ekle(int veri) {
        if (!doluMu()) {
            ust++;
            stackDizi[ust] = veri;
        } else {
            System.out.println("Stack Dolu!");
        }

    }

    public int cikar() {
        int tutamac=-1;
        if (!bosMu()) {
            tutamac = stackDizi[ust];
            ust--;

        } else {
            System.out.println("Stack Bos!");
        }
        return tutamac;
    }

}
