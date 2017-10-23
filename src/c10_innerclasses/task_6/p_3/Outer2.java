package c10_innerclasses.task_6.p_3;

import c10_innerclasses.task_6.p_2.Outer;

public class Outer2 extends Outer {
    public void methodOut() {
        exampleInterface();
    }

    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.exampleInterface();
    }
}
