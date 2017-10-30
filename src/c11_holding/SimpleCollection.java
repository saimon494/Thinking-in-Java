package c11_holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

// 2 - Set instead of ArrayList
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<>();
        for (int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for (Integer i : c)
            System.out.print(i + ", ");
    }
}
