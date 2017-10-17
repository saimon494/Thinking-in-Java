package c9_interfaces.task_12;

public class ActionCharacter {
    public void fight() {
        System.out.println(this + " fight()");
    }

    @Override
    public String toString() {
        return "ActionCharacter";
    }
}
