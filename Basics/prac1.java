public class prac1 {
    public static class prac1{
        void name(){
            System.out.println("A");
        }
    }
    public static class prac1 extends A {
        void name(){
            System.out.println("A");
        }
    }
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        A obj4 = new B();
        // B obj3 = new A(); // compile time error Reason:
        /*
        A is not a B.
        Parent cannot be assigned to a child reference.
        */
    }
}

