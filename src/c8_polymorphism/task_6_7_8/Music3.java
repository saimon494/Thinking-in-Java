package c8_polymorphism.task_6_7_8;

// 6, 7, 8, 9 - todo
public class Music3 {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneall(Instrument[] e) {
        for(Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
        };
        tuneall(orchestra);

    }

}
