package c7_reusing;

// 16 - Ascending transformation
// 18 - final static
// 19 - final empty link
// 21 - final method
public class Amphibian {
    final int legs = 4; // 18
    final static int eyes = 2; // 18
    final Amphibian number; // 19
    final void check(){
        System.out.println("Check it!");
    }

    public Amphibian() {
        number = new Amphibian();
    }

    void breathe() {
        System.out.println("breathing");
    }

    void swim() {
        System.out.println("swimming with " + legs + " legs");
    }

    void watch() {
        System.out.println("watching with " + eyes + " eyes");
    }

}
