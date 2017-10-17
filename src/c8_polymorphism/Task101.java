package c8_polymorphism;

public class Task101 extends Task10 {
    @Override
    void method2() {
        System.out.println("method2 again");
    }

    public static void main(String[] args) {
        Task10 task101 = new Task101();
        task101.method1();
    }

}
