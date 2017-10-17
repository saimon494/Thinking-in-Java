package c7_reusing;

// 3,4,5 - parent class initialization, default constructors
// 6,7 - constructors with arguments

public class Cartoon extends Drawing {


    public Cartoon() {
        super(11);
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon c = new Cartoon();
    }
}
