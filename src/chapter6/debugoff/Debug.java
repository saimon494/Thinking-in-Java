package chapter6.debugoff;

import chapter6.debug.DebugChild;

// 3 - Conditional compilation
public class Debug {//extends chapter6.debug.Debug {

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

