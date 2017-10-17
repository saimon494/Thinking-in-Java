package c8_polymorphism.task_13;

// 13 - ref count
// 14 - add finalize(), todo
// 15 - task 12 add ref count, todo
public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();

        Composing[] composing = {
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared)
        };
        for (Composing c : composing) {
            c.dispose();
        }
    }
}
