package chapter6.debug;


// 3 - Conditional compilation
public class Debug {

    protected String name = "Parent name"; // 6

    public static void debug(String s) {
        System.out.println(s);
    }

    protected void protectedMethod() { // 4
        System.out.println("Protected method");
    }

    // 5 - access levels
    private void privateMethod() {
        System.out.println("Private method");
    }

    public static void main(String[] args) {
        Debug d = new Debug();
        d.privateMethod();
        d.protectedMethod();
        debug("Public static method");
    }
}


