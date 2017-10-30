package c11_holding;

import c10_innerclasses.task_20.Selector;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

// 3 - scanner, static field
public class Sequence {
    private Object[] items;
    private int next = 0;
    static int size = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in sequence ");
        if (sc.hasNextInt()) {
            size = sc.nextInt();
        } else {
            System.out.println("Wrong number");
        }

        Sequence sequence = new Sequence(size);
        for (int i = 0; i < size; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
