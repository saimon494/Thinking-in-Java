package c10_innerclasses.task_20;

import java.util.Arrays;
import java.util.Collections;

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if(next < items.length) {
            items[next++] = x;
        }
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
            if(i < items.length) {
                i++;
            }
        }
    }

    private class ReverseSequenceSelector implements Selector {
        private int i = 9;

        public boolean end() {
            return i == -1;
        }
        public Object current() {
            return items[i];
        }
        public void next() {
            if(i < items.length) {
                i--;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public Selector reverseSelector() {
        return new ReverseSequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);

        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

        Selector selector = sequence.selector();
        Selector reverseSelector = sequence.reverseSelector();

        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();
        while (!reverseSelector.end()) {
            System.out.print(reverseSelector.current() + " ");
            reverseSelector.next();
        }

    }
}