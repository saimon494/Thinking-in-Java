package chapter5;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
//        out.println("Inside main()"); // 13
//        Cups.cup1.f(99);


//        Book novel = new Book(true);  // 11
//        novel.checkIn();
//        new Book(true);
//        System.gc();
//        novel.finalize();
//        F f = new F();    //10
//        f.finalize();
//        Test t = new Test();  //7
//        System.out.println(t);
//        Dog dog = new Dog();  // 5
//        dog.bark("bark",4);
//        dog.bark(3, "yelp");
    }

//    static Cups cups1 = new Cups(); // 13
//    static Cups cups2 = new Cups();
}

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
//class Test {
//    Test(int i){
//        this(3, 4);
//    }
//
//    Test(int i, int j){
//
//    }
//}

// 8 - this, use in non-static class
//class Test {
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
//class Test {
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
//class Test {
//    Test() {
//        System.out.println("Default constructor");
//    }
//
//    Test(String s) {
//        System.out.println(s);
//    }
//}

// 1, 2
//class Test {
//    String field = " ";
//
//    public Test(String newField) {
//        newField = " ";
//    }
//}

