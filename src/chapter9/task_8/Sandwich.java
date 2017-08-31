package chapter9.task_8;

// 8 - interface
public class Sandwich extends PortableLunch implements Fastfood {
    public void Bread() {
        System.out.println("Bread()");
    }

    public void Cheese() {
        System.out.println("Cheese()");
    }

    public void Pickle() {
        System.out.println("Pickle()");
    }

    public void Lettuce() {
        System.out.println("Lettuce()");
    }

    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Pickle p = new Pickle();
    private Lettuce l = new Lettuce();

    public Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();

    }
}
