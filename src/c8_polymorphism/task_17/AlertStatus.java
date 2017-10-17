package c8_polymorphism.task_17;

public class AlertStatus {
    private Alert alert = new Alert1();

    public void switchStatus() {
        alert = new Alert2();
    }

    public void status() {
        alert.alert();
    }
}
