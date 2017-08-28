package chapter8.task_2_3_4_5;

// 2 - @Override, 3 - new method, 4 - new shape, 5 - method wheels
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[5];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for(Shape shp : s) {
            shp.message();
            shp.draw();
        }

    }
}
