package c9_interfaces.task_13_14_15;

public class TestChild extends Test implements Able4 {
    public void method1() {
        System.out.println(this + ".method1");
    }
    public void method2() {
        System.out.println(this + ".method2");
    }
    public void method3() {
        System.out.println(this + ".method3");
    }
    public void method4() {
        System.out.println(this + ".method4");
    }
    public void method5() {
        System.out.println(this + ".method5");
    }
    public void method6() {
        System.out.println(this + ".method6");
    }
    public void method7() {
        System.out.println(this + ".method7");
    }

    @Override
    public String toString() {
        return "TestChild";
    }


}
