package chapter7;

// 8 - parent constructor call
public class Task81 extends Task8 {
    public Task81() {
        super.showTask();
        System.out.println("def cons");
    }

    public Task81(String s) {
        super.showTask();
        System.out.println(s);
    }

    public static void main(String[] args) {
        Task81 t = new Task81("Hi");
    }
}
