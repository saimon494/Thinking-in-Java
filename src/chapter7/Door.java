package chapter7;

// 14 - composition
public class Door {
    public Window window = new Window();
    public void open(){
        System.out.println("Door is open");
    }
    public void close(){
        System.out.println("Door is close");
    }

}
