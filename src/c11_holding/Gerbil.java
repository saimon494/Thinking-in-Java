package c11_holding;

import java.util.ArrayList;
import java.util.Iterator;


// 8 - iterator
public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public int hop() {
        System.out.print("gerbil number = ");
        return gerbilNumber;
    }

    public void get() {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < gerbilNumber; i++) {
            gerbils.add(new Gerbil(i));
        }
        for (Gerbil p : gerbils) {
            System.out.println(p.hop());
        }
    }

    public static void main(String[] args) {
        Gerbil gerbil = new Gerbil(8);
        gerbil.get();
    }
}

// 1 - add obj to array
//public class Gerbil {
//    private int gerbilNumber;
//
//    public Gerbil(int gerbilNumber) {
//        this.gerbilNumber = gerbilNumber;
//    }
//
//    public int hop() {
//        System.out.print("gerbil number = ");
//        return gerbilNumber;
//    }
//
//    public void get() {
//        ArrayList<Gerbil> gerbils = new ArrayList<>();
//        for (int i = 0; i < gerbilNumber; i++) {
//            gerbils.add(new Gerbil(i));
//        }
//        for (Gerbil p : gerbils) {
//            System.out.println(p.hop());
//        }
//    }
//
//    public static void main(String[] args) {
//        Gerbil gerbil = new Gerbil(8);
//        gerbil.get();
//    }
//}
