package chapter9.task_9_10;

// 9 - abstract class
public abstract class Abs {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}
