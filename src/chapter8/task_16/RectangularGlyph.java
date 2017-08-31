package chapter8.task_16;

// 16 - polymorphic methods with constructors
public class RectangularGlyph extends Glyph {
    private int a, b = 1;

    RectangularGlyph(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("RectangularGlyph.RectangularGlyph(), a = " + a + ", b = " + b);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), a = " + a + ", b = " + b);
    }
}
