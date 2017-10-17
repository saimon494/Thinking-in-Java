package c9_interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

// 16 - interface Readable
public class RandomWords implements Readable {
    private static Random rand = new Random(47);
    private final static char[] capitals = "ABCDEFG".toCharArray();
    private final static char[] lowers = "abcdef".toCharArray();
    private int count;

    public RandomWords(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) {
        if (count-- == 0) {
            return -1;
        }
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomWords(10));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }

}
