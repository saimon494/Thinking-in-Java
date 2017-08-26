package chapter6;

// 23, 24 - order initialization in class
public class Beetle extends Insect {
    private int k = printInt("Field Beetle.k initialized");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInt("Field Beetle.x2 initialized");

    public static void main(String[] args) {
//        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
        System.out.println("Beetle constructor");
    }
}
