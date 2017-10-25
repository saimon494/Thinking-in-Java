package c10_innerclasses.task_24;

public class Outer2 extends Outer.Inner {
    public Outer2(Outer o) {
        o.super();
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer2 o2 = new Outer2(o);
    }
}
