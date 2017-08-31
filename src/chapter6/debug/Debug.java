package chapter6.debug;


// 3 - Conditional compilation
public class Debug {

// 8 - class constructor protect
//    private Debug() {
//    }
    private void privateMethod() {
        System.out.println("Private method");
    }
    // 5 - access levels
    protected String name = "Parent name"; // 6

    protected void protectedMethod() { // 4
        System.out.println("Protected method");
    }

//    public static Debug makeDebug(){
//        return new Debug();
//    } // 8
    public static void debug(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        Debug d = new Debug();
        d.privateMethod();
        d.protectedMethod();
        debug("Public static method");
    }
}


