package odev10;

public class Kuyruk {
    private int bas;
    private int son;
    private int kuyrukDizi [];
    private int boyut;
    public Kuyruk(int boyut){
        this.boyut=boyut;
        kuyrukDizi=new int[this.boyut];
        bas=0;
        son=0;

    }
    public boolean bosMu(){
        if (bas==son){ return true;}
        else{ return false;}
    }
    public boolean doluMu(){
        return (bas == (son + 1) % boyut);
    }
    public void Ekle(int veri){
        if (!doluMu()){
            kuyrukDizi[son] = veri;
            son = (son + 1) % boyut;

        }
        else
            System.out.println("dolu");
    }
    public int Cikar() {
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
