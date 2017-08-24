package chapter7;

public class Root {
    public Root() {
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

    public Component1 c1 = new Component1(1);
    public Component2 c2 = new Component2();
    public Component3 c3 = new Component3();
}
