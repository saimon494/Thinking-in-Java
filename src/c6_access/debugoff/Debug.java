package c6_access.debugoff;

// 3 - Conditional compilation
public class Debug {//extends c6_access.debug.Debug {

    // 8 - class constructor protect
    private Debug() {
    }

    private static Debug d = new Debug();
    public static Debug access() {
        return d;
    }

    public static void debug() {

    }
    public static void main(String[] args) {
//        DebugChild dc = new DebugChild(); // 4
//        dc.method(); //Error - method() has protected access
    }

}

