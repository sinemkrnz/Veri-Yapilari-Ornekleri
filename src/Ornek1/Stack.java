package odev1;

public class Stack {
    private int boyut;
    private int ust;
    private char stackDizi[];


    public Stack(int boyut) {
        this.boyut = boyut;
        stackDizi = new char[this.boyut];
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

    public void ekle(char veri) {
        if (!doluMu()) {
            ust++;
            stackDizi[ust] = veri;
        } else {
            System.out.println("Stack Dolu!");
        }

    }

    public char cikar() {
        char tutamac= '-';
        if (!bosMu()) {
            tutamac = stackDizi[ust];
            ust--;

        } else {
            System.out.println("Stack Bos!");
        }
        return tutamac;
    }

}