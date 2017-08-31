package chapter7;

// 9, 10 - inheritance
public class Stem extends Root {
    public Stem() {

    }

    void despose(){
        super.despose();
    } // 12

    public static void main(String[] args) {
        Stem s = new Stem();
        s.despose();
        System.out.println(s);
    }
}
