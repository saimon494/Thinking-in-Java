package chapter7;

// 16 - Ascending transformation
// 17, 20 - overriding
// 18 - final static
// 21 - final method override
// 22 - final class

public class Frog extends Amphibian{

    @Override // 20
    void breathe() {
        System.out.println("Frog breathing");
//        super.breathe();
    }

    @Override
    void swim() {
//        System.out.println("Frog swimming");
        super.swim();
    }

    @Override
    void watch() {
        super.watch();
    }

//    @Override // 21
//    void check() {
//        super.watch();
//    }


    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.breathe();
        frog.swim();
        frog.watch();
        System.out.println("number of eyes = " + eyes); // 18
//        System.out.println(legs);
        System.out.println();
    }
}
