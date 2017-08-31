package chapter7;

// 11 - delegation
public class Detergent {
    private Cleanser c = new Cleanser();

    public void append(){
        c.append("Hi");
    }

    public void dilute(){
        c.dilute();
    }

    public void apply(){
        c.apply();
    }

    public static void main(String[] args) {
        Detergent d = new Detergent();
        d.append();
        d.dilute();
        d.apply();
        System.out.println(d);
    }
}

