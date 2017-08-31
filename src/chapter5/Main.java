package chapter5;

import chapter6.*;

public class Main {

   MyClass myClass = new MyClass(); // 1 - chapter6

// 21 - enum
    public enum Money {
        USA, RUB, EUR, JPY
    }
// 22 - enum with switch
    Money option;

    public Main(Money option) {
        this.option = option;
    }

    public void describe() {
        System.out.print("This money is from ");
        switch (option) {
            case USA:
                System.out.println("United States");
                break;
            case RUB:
                System.out.println("Russia");
                break;
            case EUR:
                System.out.println("Europe");
                break;
            case JPY:
                System.out.println("Japan");
        }

    }

    public static void main(String[] args) {

        Main
                u = new Main(Money.USA),
                r = new Main(Money.RUB),
                e = new Main(Money.EUR),
                j = new Main(Money.JPY);

        u.describe();
        r.describe();
        e.describe();
        j.describe();



//        for (Money m : Money.values()) { // 21
//            System.out.println(m + ", ordinal " + m.ordinal());
//        }
//    public static void main(String... args) { //20
//        Run -> Edit Config -> Program arguments
//        for (String s : args) {
//            System.out.print(s + " ");
//            System.out.println();
//        }
//        System.out.println(args.getClass());
//        System.out.println("length:" + args.length);
//        System.out.println(args);

//        varArgs("ab, c"); // 19
//        varArgs("Hello", "Java");
//        varArgs(new String[]{"Wazzup", "Man"});

//        TestChild t = new TestChild("String"); // 17,18
//        TestChild[] arr = new TestChild[]{
//                new Test("a"),
//                new Test("b"),
//        };

//        String s1 = "string 1"; // 16
//        String s2 = "string 2";
//        String[] stringArray = new String[2];
//        stringArray[0] = s1;
//        stringArray[1] = s2;
//
//        for (int i = 0; i < stringArray.length; i++) {
//            System.out.println(stringArray[i]);
//        }

//        out.println("Inside main()"); // 13
//        Cups.cup1.f(99);
//        Book novel = new Book(true);  // 11
//        novel.checkIn();
//        new Book(true);
//        System.gc();
//        novel.finalize();
//        F f = new F();    //10
//        f.finalize();
//        TestChild t = new TestChild();  //7
//        System.out.println(t);
//        Dog dog = new Dog();  // 5
//        dog.bark("bark",4);
//        dog.bark(3, "yelp");
    }


// 19 - - variable-length arguments - varargs
//    static void varArgs(String... v) {
//        System.out.print("Number og arguments: " + v.length + ", Content: ");
//        for (String s : v) {
//            System.out.print(s + " ");
//            System.out.println();
//        }
//    }

//    static Cups cups1 = new Cups(); // 13
//    static Cups cups2 = new Cups();

// 17, 18 - array initialization with objects
//class TestChild {
//    public String s;
//
//    TestChild(String s) {
//        this.s = s;
//        System.out.println(s);
//    }
//}

// 15 - initialization block
//{
//    mug1 = new Mug(1);
//    mug2 = new Mug(2);
//    out.print("mug1 & mug2 initialised")
//}

// 13, 14 - static block
//class Cup {
//    Cup(int marker) {
//        out.println("Cup(" + marker + ")");
//    }
//
//    void f(int marker) {
//        out.println("f(" + marker + ")");
//    }
//}
//
//class Cups {
//    static Cup cup1;
//    static Cup cup2;
//
//    static {
//        cup1 = new Cup(1);
//        cup2 = new Cup(2);
//    }
//
//    Cups() {
//        out.println("Cups()");
//    }
//}

// 11, 12 - finalize()
//class Book {
//    boolean checkedOut = false;
//
//    Book(boolean checkOut) {
//        checkedOut = checkOut;
//    }
//
//    void checkIn() {
//        checkedOut = false;
//    }
//
//    public void finalize() {
//        if(checkedOut) {
//            System.out.println("Error: checkedOut");
//        }
//    }
//}

// 10 - finalize()
//class F {
//    public void finalize(){
//        System.out.println("finalize");
//    }
//}

// 9 - calling constructor from another
//class TestChild {
//    TestChild(int i){
//        this(3, 4);
//    }
//
//    TestChild(int i, int j){
//
//    }
//}

// 8 - this, use in non-static class
//class TestChild {
//    void m1(){
//        m2();
//        this.m2(); // wrong
//    }
//
//    void m2(){
//
//    }
//}

// 7
//class TestChild {
//}

// 5, 6 - overloading
//class Dog{
//    void bark(String s, int times) {
//        System.out.println("Dog " + s + " " + times + " times");
//    }
//    void bark(int times, String s) {
//        System.out.println(times + " times Dog " + s);
//    }
//}

// 3, 4
//class TestChild {
//    TestChild() {
//        System.out.println("Default constructor");
//    }
//
//    TestChild(String s) {
//        System.out.println(s);
//    }
//}

// 1, 2
//class TestChild {
//    String field = " ";
//
//    public TestChild(String newField) {
//        newField = " ";
//    }
}

