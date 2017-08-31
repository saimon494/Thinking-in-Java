package chapter9.task_12;

public class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {
    public void swim() {
        System.out.println(this + " swim()");
    }

    public void fly() {
        System.out.println(this + " fly()");
    }

    public void climb() {
        System.out.println(this + " climb()");
    }

    @Override
    public String toString() {
        return "Hero";
    }
}
