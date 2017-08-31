package chapter8;

// 1 - Ascending transformation
public class Cycle {
    private static String name;
    private static int numberOfWheels;
    static{
        name = "Cycle";
        numberOfWheels = 1;
    }
    public void ride(){
        System.out.println(name + " is riding on " + wheels() + " wheels");
    }

    public int wheels() {
        return numberOfWheels;
    }


}
