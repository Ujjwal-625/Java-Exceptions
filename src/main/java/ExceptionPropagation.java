public class ExceptionPropagation {

    // Method that causes an ArithmeticException
    public static void method1() {
        System.out.println("Inside method1()");
        int result = 10 / 0; // This will throw ArithmeticException
    }

    // Method that calls method1()
    public static void method2() {
        System.out.println("Inside method2()");
        method1(); // Exception propagates from method1()
    }

    // Main method
    public static void main(String[] args) {
        try {
            System.out.println("Inside main()");
            method2(); // Exception propagates from method2() to main()
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main: " + e.getMessage());
        }
    }
}
