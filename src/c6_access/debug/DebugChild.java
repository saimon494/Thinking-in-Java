package c6_access.debug;



public class DebugChild extends Debug {

    // 6 - protected data
    void ShowNameDebug(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        DebugChild dc = new DebugChild(); // 4
//        dc.protectedMethod();
        dc.ShowNameDebug();
    }
}

