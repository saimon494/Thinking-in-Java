package c10_innerclasses.task_5;

// 5 - create instance of inner class
public class OtherClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method();
    }
}
