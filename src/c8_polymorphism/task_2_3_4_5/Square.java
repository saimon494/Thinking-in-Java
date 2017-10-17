package c8_polymorphism.task_2_3_4_5;

public class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
    @Override
    public void message() {
        System.out.println("Generating new square");
    }


}
