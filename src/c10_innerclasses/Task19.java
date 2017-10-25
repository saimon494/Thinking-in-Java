package c10_innerclasses;

public interface Task19 {
    void m();
    void m2();
    class Inner implements Task19 {
        @Override
        public void m() {
            System.out.println("method");
        }

        @Override
        public void m2() {
            System.out.println("method2");
        }

        public static void main(String[] args) {
            Inner inner = new Inner();
            inner.m();
            inner.m2();
        }
    }
}
