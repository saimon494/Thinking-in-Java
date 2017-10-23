package c10_innerclasses.task_1_3;

// 1 - inner class
public class Outer {
    class Inner {
        @Override
        public String toString() {
            return s;
        }
    }

    private String s;

    public Outer() {
        s = "String";
    }

//    public Inner inner() {
//        return new Inner();
//    }

    public static void main(String[] args) {
//        Tasks outer = new Tasks();
        Outer.Inner inner = new Outer().new Inner();
        inner.toString();

    }

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
//        Tasks outer = new Tasks();
//        Tasks.Inner inner = outer.inner();
//        inner.method();
//
//    }
}
