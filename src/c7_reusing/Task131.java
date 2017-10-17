package c7_reusing;

// 13 - method overloading
public class Task131 extends Task13 {
    String method(String s) {
        System.out.println("method(String)");
        return s;
    }

    public static void main(String[] args) {
        Task131 t = new Task131();
        t.method(13);
        t.method('c');
        t.method("overload");
        t.method(1.5f);

    }
}
