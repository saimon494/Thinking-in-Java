package c10_innerclasses;

// 13
public class Outer {
    public Outer(String s) {
        System.out.println("Outer constructor");
    }
}

// 1 - inner class
//public class Outer {
//    class Inner {
//        void method() {
//            System.out.println("Inner class");
//        }
//    }
//
//    public Inner inner() {
//        return new Inner();
//    }
//
//    public static void main(String[] args) {
//        Outer outer = new Outer();
//        Outer.Inner inner = outer.inner();
//        inner.method();
//
//    }
//}
