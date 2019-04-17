package odev8;

public class Main {
    public int bitsayisi(int veri){
        if (veri>=64 && veri<128) return 7;
        if (veri>=128 && veri<256) return 8;
        if (veri>=256 && veri<512) return 9;
        if (veri>=512 && veri<1024) return 10;
    return -1;
    }

    public void binary(int veri){

        Stack binarybul=new Stack(bitsayisi(veri));
        while (veri!=0){
            binarybul.ekle(veri%2);
            veri=veri/2;

        }
        System.out.println(donustur(binarybul));


    }
    public String donustur(Stack stack){
        String sonuc="";
        while (!stack.bosMu()){
            sonuc=sonuc+String.valueOf(stack.cikar());
        }


        return sonuc;
    }


    public static void main(String[] args) {
        System.out.println("Lütfen 64-1024 arasında sayı giriniz!!!");
        int sayi=233;
        Main yeni=new Main();
        yeni.binary(sayi);

    }
}
