package chapter9.task_12;

public class ActionCharacter {
    public void fight() {
        System.out.println(this + " fight()");
    }

    @Override
    public String toString() {
        return "ActionCharacter";
    }
}
