package odev4;

public class Main {
    public static void main(String[] args) {
        MHeap maxHeap = new MHeap(5);
        maxHeap.ekle(53);
        maxHeap.ekle(88);
        maxHeap.ekle(2);
        maxHeap.ekle(34);

        MHeap maxHeap2 = new MHeap(5);
        maxHeap2.ekle(45);
        maxHeap2.ekle(100);
        maxHeap2.ekle(14);
        maxHeap2.ekle(1);

        System.out.println("Arama Sonucu = "+maxHeap.ara(53));

        int[] siralanmisDizi = new int[maxHeap.heapSize + maxHeap2.heapSize];
        siralanmisDizi = maxHeap.sirala(maxHeap, maxHeap2);
        for (int j = 0; j < siralanmisDizi.length; j++) {
            System.out.println(siralanmisDizi[j]);
        }


    }
}
