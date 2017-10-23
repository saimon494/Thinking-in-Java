package c10_innerclasses;

import c10_innerclasses.task_6.p_1.ExampleInterface;

// 11
public class Tasks {
    private class Inner implements ExampleInterface {

        @Override
        public void methodInt() {
            System.out.println("inner method");
        }
    }

    public ExampleInterface method() {
        return new Inner();
    }

    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        tasks.method().methodInt();
    }
}

// 10 - anonymous inner class
//public class Tasks {
//    public ExampleInterface exampleMethod() {
//        return new ExampleInterface() {
//            @Override
//            public void methodInt() {
//            }
//        };
//    }
//}

// 9
//public class Tasks {
//    private class Inner implements ExampleInterface {
//
//        @Override
//        public void methodInt() {
//            System.out.println("inner method");
//        }
//    }
//
//    public ExampleInterface method() {
//         return new Inner();
//    }
//
//    public static void main(String[] args) {
//        Tasks tasks = new Tasks();
//        tasks.method().methodInt();
//    }
//}

// 8(2)
//public class Tasks {
//    private void method(boolean b) {
//        if(b) {
//            class Inner {
//                private String id;
//
//                Inner(String s) {
//                    id = s;
//                }
//                String getId() {
//                    return id;
//                }
//            }
//
//            Inner inner = new Inner("string");
//            String s = inner.getId();
//            System.out.println(s);
//        }
//    }
//    public void track() {
//        method(true);
//    }
//
//    public static void main(String[] args) {
//        Tasks tasks = new Tasks();
//        tasks.track();
//    }
//}

// 7(2) - local inner class
//public class Tasks {
//    public ExampleInterface exampleMethod() {
//        class Inner implements ExampleInterface {
//            @Override
//            public void methodInt() {
//
//            }
//        }
//        return new Inner();
//    }
//}


// 7, 8 - private inner filed and method,
//public class Tasks {
//
//    private String s1 = "outer string";
//    private void method1() {
//        System.out.println("outer method " + s1);
//    }
//    private void method2() {
//        Inner inner = new Inner();
//        inner.innerMethod();
//    }
//
//    class Inner {
//        private void innerMethod() {
//            s1 = "inner string";
//            method1();
//        }
//    }
//
//    public static void main(String[] args) {
//        Tasks tasks = new Tasks();
//        tasks.method1();
//        tasks.method2();
//    }
//}
// 1 - inner class
// public class Tasks {
//    class Inner {
//        void method() {
//            System.out.println("Inner class");
//        }
//    }
//
//    public Inner inner() {
//        return new Inner();
//    }
//
//    public static void main(String[] args) {
//        Tasks outer = new Tasks();
//        Tasks.Inner inner = outer.inner();
//        inner.method();
//    }
// }
