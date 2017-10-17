package c7_reusing;

// 3,4,5 - parent class initialization, default constructors
// 6,7 - constructors with arguments

class Drawing extends Art {

    Drawing(int i) {
        super(i);
        System.out.println("Drawing constructor and i = " + i);
    }
}
