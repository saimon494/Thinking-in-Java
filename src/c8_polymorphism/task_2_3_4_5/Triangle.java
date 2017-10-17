package c8_polymorphism.task_2_3_4_5;

public class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void message() {
        System.out.println("Generating new triangle");
    }
}
