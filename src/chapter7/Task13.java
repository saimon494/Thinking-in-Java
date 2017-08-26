package chapter7;

// 13 - method overloading
public class Task13 {
    int method(int i) {
        System.out.println("method(int)");
        return i;
    }
    char method(char c) {
        System.out.println("method(char)");
        return c;
    }
    float method(float f) {
        System.out.println("method(int)");
        return 1.0f;
    }
}
