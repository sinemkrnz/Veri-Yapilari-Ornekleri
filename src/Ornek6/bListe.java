package odev6;

public class bListe {
    Eleman bas;
    Eleman son;

    public bListe() {
        bas = null;
        son = null;
    }

    void basaEkle(Eleman yeni) {
        if (son == null) {
            bas = yeni;
            son = yeni;

        } else {
            yeni.ileri = bas;
            bas = yeni;
        }

    }

    void sonaEkle(Eleman yeni) {
        if (bas == null) {
            son = yeni;
            bas = yeni;

        } else {
            son.ileri = yeni;
            son = yeni;
        }
    }
    void istenilenSirayaEkle(int indis, Eleman yeni){
        Eleman tmp=bas;
        for (int i=0;i<indis;i++){
            tmp=tmp.ileri;
        }
        yeni.ileri=tmp.ileri;
        tmp.ileri=yeni;

    }
    void bastanSil(){
      bas=bas.ileri;
      if (bas==null){
          son=null;

        }

    }
    void sondanSil(){
        Eleman tmp=bas;
        Eleman once;
        once=null;
        while (tmp!=son){
            once=tmp;
            tmp=tmp.ileri;
        }
        if(once==null){
            bas=null;
        }
        else{
            once.ileri=null;

        }
        son=once;
    }
   void SıradanSil(int indis){
        Eleman tmp=bas;
        Eleman sonraki=null;
        if(indis==1){
            bastanSil();
        }
        if (indis==elemanSayisi()){
            sondanSil();
        }
        if (indis>0&&indis<elemanSayisi()){
            for (int i = 0; i < indis-2; i++) {

                tmp=tmp.ileri;

            }

            tmp.ileri=tmp.ileri.ileri;
        }




    }

    int elemanSayisi() {
        int sayac = 0;
        Eleman tmp;
        tmp = bas;
        while (tmp != null) {
            tmp = tmp.ileri;
            sayac++;
        }
        return sayac;
    }
    public String goster() {
        String s = " ";
        Eleman tmp = bas;
        while (tmp != null) {
           s=s+"-"+tmp.icerik;
            tmp=tmp.ileri;
        }
        return s;
    }

}
