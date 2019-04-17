package odev3;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        IkiliAgac agac = new IkiliAgac();
        Ogrenci nesne0 = new Ogrenci("Oliver", "Queen", 23);
        Ogrenci nesne1 = new Ogrenci("Barry", "Allen", 44);
        Ogrenci nesne2 = new Ogrenci("Clark", "Kent", 19);
        Ogrenci nesne3 = new Ogrenci("Bruce", "Wayne", 38);
        Ogrenci nesne4 = new Ogrenci("Cisco", "Ramon", 66);
        Ogrenci nesne5 = new Ogrenci("John", "Diggle", 81);
        Ogrenci nesne6 = new Ogrenci("Felicity", "Smoak", 8);
        Ogrenci nesne7 = new Ogrenci("Roy", "Palmer", 7);
        Ogrenci nesne8 = new Ogrenci("Caitlin", "Snow", 2);
        Ogrenci nesne9 = new Ogrenci("Harryson", "Wells", 11);
        Ogrenci nesne10 = new Ogrenci("Joe", "West", 77);
        Ogrenci nesne11 = new Ogrenci("Thea", "Queen", 54);
        agac.ekle(nesne0);
        agac.ekle(nesne1);
        agac.ekle(nesne2);
        agac.ekle(nesne3);
        agac.ekle(nesne4);
        agac.ekle(nesne5);
        agac.ekle(nesne6);
        agac.ekle(nesne7);
        agac.ekle(nesne8);
        agac.ekle(nesne9);
        agac.ekle(nesne10);
        agac.ekle(nesne11);
        agac.seviyeGoster();
        System.out.println(" ");
        System.out.println(" ");
        //System.out.println(agac.dengeliMi(agac.kok));
        System.out.println(" ");
        System.out.println("***Inorder Gezinme***");
        agac.inOrder(agac.kok);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("***Preorder Gezinme***");
        agac.preOrder(agac.kok);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("***Postorder Gezinme***");
        agac.postOrder(agac.kok);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("***Tüm Yapraklar***");
        LinkedList<Ogrenci> list = new LinkedList<Ogrenci>();
        list = agac.yapraklariBul(agac.kok);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).ad + " " + list.get(i).soyad + " " + list.get(i).numara + " (Yaprak) ");
        }
        System.out.println(" ");
        System.out.println("***Silinen Yapraklar***");
        for (int i = 0; i < list.size(); i++) {
            agac.YaprakSil(list.get(i).numara);
            System.out.println(list.get(i).ad + " " + list.get(i).soyad + " " + list.get(i).numara);
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("***Ağaç***");
        agac.seviyeGoster();


        Ogrenci asd=agac.ara(23);
        System.out.println("Aranan Öğrenci "+ asd.ad);


    }

}
