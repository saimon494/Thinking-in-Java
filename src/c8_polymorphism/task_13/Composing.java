package c8_polymorphism.task_13;

public class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("Create " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("Disposing " + this);
        shared.dispose();
    }

    public String toString() {
        return "Composing " + id;
    }
}
