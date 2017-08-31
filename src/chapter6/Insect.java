package chapter6;

// 23, 24 - order initialization in class
public class Insect {
    private int i = 9;
    protected int j;
    Insect(){
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    static int printInt (String s){
        System.out.println(s);
        return 47;
    }
    private static int x1 = printInt("Field Insect.x1 initialized");

}
