package chapter8;

// 1 - Ascending transformation
public class Cycle {
    private String name;
    public static int numberOfWheels;
    public void ride(String name){
        System.out.println(name + " is riding on " + wheels() + " wheels");
    }

    public int wheels() {
        return numberOfWheels;
    }


}
