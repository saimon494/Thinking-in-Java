package c7_reusing;

// 9, 10 - inheritance
public class Root {
    public Root() {
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

    void despose(){
        System.out.println("Component1 remove");
        c1.despose();
    }

    public Component1 c1 = new Component1(1);
    public Component2 c2 = new Component2();
    public Component3 c3 = new Component3();


}
