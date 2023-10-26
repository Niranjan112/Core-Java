package trycatchfinally;

public class Main {
    public static void main(String[] args) {
        /**
        * Finally will only not execute in below two cases:
         * 1. If we System.exit() function
         * 2. If the system crashes.
        * */
        System.out.println("Returned int: " + testFinally1());
    }

    static int testFinally1() {
        try {
            System.out.println("Try block");
            return 1;
        } catch (Exception e) {
            System.out.println("Catch block");
        } finally {
            System.out.println("Finally block");
            return 2;
        }
    }
}
