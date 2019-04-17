package odev3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IkiliAgac {
    Ogrenci kok;

    public IkiliAgac() {
        kok = null;
    }

    public void ekle(Ogrenci yeniOgrenci) {
        Ogrenci mevcutDugum = null;
        Ogrenci parent = kok;
        while (parent != null) {
            mevcutDugum = parent;
            if (yeniOgrenci.numara < parent.numara) {
                parent = parent.sol;
            } else {
                parent = parent.sag;
            }
        }
        if (mevcutDugum == null) {
            kok = yeniOgrenci;
        } else if (yeniOgrenci.numara < mevcutDugum.numara) {
            mevcutDugum.sol = yeniOgrenci;

        } else {
            mevcutDugum.sag = yeniOgrenci;
        }
        //System.out.println("yeni ögrenci eklendi");
    }

    public void inOrder(Ogrenci dugum) {
        if (dugum == null) {
            return;
        }
        inOrder(dugum.sol);
        System.out.print(dugum.numara + " ");
        inOrder(dugum.sag);

    }

    public void preOrder(Ogrenci dugum) {
        if (dugum == null) {
            return;
        }
        System.out.print(dugum.numara + " ");
        inOrder(dugum.sol);
        inOrder(dugum.sag);

    }

    public void postOrder(Ogrenci dugum) {
        if (dugum == null) {
            return;
        }
        postOrder(dugum.sag);
        postOrder(dugum.sol);
        System.out.print(dugum.numara + " ");
    }

    public Ogrenci ara(int numara) {
        Ogrenci bulunan = null;
        Ogrenci dugum = kok;
        while (dugum != null) {
            if (dugum.numara == numara) {
                bulunan = new Ogrenci(dugum.ad, dugum.soyad, dugum.numara);
                return bulunan;
            } else if (dugum.numara > numara) {
                dugum = dugum.sol;
            } else {
                dugum = dugum.sag;
            }
        }
        return bulunan;

    }

    public boolean YaprakSil(int numara) {
        Ogrenci mevcutDugum = kok;
        Ogrenci parent = kok;
        boolean solundakiMi = true;
        while (mevcutDugum.numara != numara) {
            parent = mevcutDugum;
            if (numara < mevcutDugum.numara) {
                solundakiMi = true;
                mevcutDugum = mevcutDugum.sol;
            } else {
                solundakiMi = false;
                mevcutDugum = mevcutDugum.sag;
            }
            if (mevcutDugum == null) {
                return false;
            }
        }
        if (mevcutDugum.sol == null && mevcutDugum.sag == null) {
            if (mevcutDugum == kok) {
                kok = null;
            } else if (solundakiMi) {
                parent.sol = null;

            } else {
                parent.sag = null;
            }

            return true;
        } else {
            return false;

        }

    }

    public LinkedList<Ogrenci> yapraklariBul(Ogrenci kok) {
        LinkedList<Ogrenci> list = new LinkedList<Ogrenci>();
        if (kok == null) {
            return list;
        }
        Stack<Ogrenci> stack = new Stack<Ogrenci>();
        stack.push(kok);
        while (!stack.isEmpty()) {
            Ogrenci dugum = stack.pop();

            if (dugum.sag != null) {

                stack.add(dugum.sag);
            }
            if (dugum.sol != null) {

                stack.add(dugum.sol);
            }
            if (dugum.sol == null && dugum.sag == null) {

                list.add(dugum);
            }
        }

        return list;
    }

    public void seviyeGoster() {
        Queue<Ogrenci> kuyruk = new LinkedList<Ogrenci>();
        Ogrenci dugum = kok;
        if (dugum != null) {
            kuyruk.add(dugum);
        }
        int i = 0;
        int j = 0;
        while (!kuyruk.isEmpty()) {
            dugum = kuyruk.remove();
            if (dugum.sol != null) {
                kuyruk.add(dugum.sol);
            }
            if (dugum.sag != null) {
                kuyruk.add((dugum.sag));
            }
            System.out.println(dugum.ad + " " + dugum.soyad + " " + dugum.numara);
            int us = (int) (Math.pow(2, j));
            i++;
            if (i == us) {
                j++;
                i = 0;
                System.out.println(" * ");

            }
        }

    }

    /*public boolean dengeliMi(Ogrenci dugum) {
        int sag;
        int sol;
        if (dugum == null) {
            return true;

        }
        sol = yukseklik(dugum.sol);
        sag = yukseklik(dugum.sag);
        if (Math.abs(sol - sag) <= 1 && dengeliMi(dugum.sol) && dengeliMi(dugum.sag)) {
            return true;
        }
        return false;
    }*/

    /*private int yukseklik(Ogrenci dugum) {
        if (dugum == null) {
            return 0;
        }
        return 1 + Math.max(yukseklik(dugum.sol), yukseklik(dugum.sag));
    }*/
}
