package c7_reusing;

// 11 - delegation
public class Cleanser {
    private String s = "Claenser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public String toString(){
        return s;
    }

}
