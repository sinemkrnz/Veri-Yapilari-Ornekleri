package odev4;

public class MHeap {
    //private static final int d = 2;
    private int[] heap;
    public int heapSize;

    public MHeap(int boyut) {
        heapSize = 0;
        heap = new int[boyut - 1];
    }

    public boolean bosMu() {
        return heapSize == 0;
    }

    public boolean doluMu() {
        return heapSize == heap.length;
    }

    public void ekle(int veri) {
        if (doluMu()) {
            System.out.println("Heap Dolu");
        } else {
            heap[heapSize++] = veri;
            int i = heapSize - 1;
            int temp = heap[i];
            while (i > 0 && temp > heap[(i - 1) / 2]) {
                heap[i] = heap[(i - 1) / 2];
                i = (i - 1) / 2;
            }
            heap[i] = temp;
        }
    }

    public int cikar() {
        int indis = 0;
        if (bosMu()) {
            System.out.println("Heap Boş");
            return -1;
        } else {
            int veri = heap[indis];
            heap[indis] = heap[heapSize - 1];
            heapSize--;
            int cocuk;
            int temp = heap[indis];
            while ((2 * indis) + 1 < heapSize) {
                cocuk = heap[(2 * indis) + 1] > heap[(2 * indis) + 2] ? (2 * indis) + 1 : (2 * indis) + 2;
                if (temp < heap[cocuk]) {
                    heap[indis] = heap[cocuk];
                } else {
                    break;
                }
                indis = cocuk;
                heap[indis] = temp;

            }
            return veri;
        }
    }

    public int[] sirala(MHeap heap1, MHeap heap2) {
        int siralanmisDizi[] = new int[heap1.heapSize + heap2.heapSize];
        int i = 0;
        while (!heap1.bosMu() && !heap2.bosMu()) {
            int temp = heap1.cikar();

            int temp2 = heap2.cikar();

            if (temp > temp2) {
                siralanmisDizi[i] = temp;

                siralanmisDizi[i + 1] = temp2;
                i = i + 2;
            } else {
                siralanmisDizi[i] = temp2;

                siralanmisDizi[i + 1] = temp;
                i = i + 2;
            }
        }
        return siralanmisDizi;
    }
    public boolean ara(int aranan){
        boolean sonuc=false;
        for (int i = 0; i < heapSize; i++) {
            if(heap[i]==aranan){
                sonuc=true;
            }
        }
        return sonuc;
    }


}