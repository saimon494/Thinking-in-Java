package c10_innerclasses.task_6.p_2;

import c10_innerclasses.task_6.p_1.ExampleInterface;

public class Outer {
    private class Inner implements ExampleInterface {
        @Override
        public void methodInt() {
            System.out.println("inner method");
        }
    }

    public ExampleInterface exampleInterface() {
        return new Inner();
    }


}
