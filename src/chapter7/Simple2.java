package chapter7;

// 1 - lazy initialization
public class Simple2 {

    private Simple s;
    public Simple2() {
        System.out.println("Simple2 constructor");
        s = new Simple(); // 1
    }

    public String toString() {
        return "s = " + s;
    }

    public static void main(String[] args) {
        Simple2 s2 = new Simple2();
        System.out.println(s2);
    }
}
