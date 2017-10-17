package c8_polymorphism.task_1;

public class Unicycle extends Cycle {
    String name = "unicycle";
    int numberOfWheels = 1;

    @Override
    public void ride() {
        super.ride();
    }

    @Override
    public int wheels() {
        return super.wheels();
    }
}
