package c10_innerclasses;

public interface Task18 {
    void m();
    class Inner implements Task18 {
        @Override
        public void m() {
            System.out.println("class in interface");
        }
    }

    public static void main(String[] args) {
        new Inner().m();
    }
}
