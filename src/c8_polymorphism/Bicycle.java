package c8_polymorphism;

public class Bicycle extends Cycle {
    String name = "bicycle";
    int numberOfWheels = 2;


    @Override
    public void ride() {
        super.ride();
    }

    @Override
    public int wheels() {
        return super.wheels();
    }
}
