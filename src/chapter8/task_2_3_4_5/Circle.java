package chapter8.task_2_3_4_5;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    @Override
    public void message() {
        System.out.println("Generating new circle");
    }

}
