package c9_interfaces.task_13_14;

public class Test {
    public static void methodTest1(Able1 a1) {
        a1.method1();
    }

    public void methodTest2(Able2 a2) {
        a2.method3();
    }

    public void methodTest3(Able3 a3) {
        a3.method5();
    }

    public void methodTest4(Able4 a4) {

    }

    public static void main(String[] args) {
        TestChild testChild = new TestChild();
        testChild.method1();
    }
}
