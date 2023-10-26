package trycatchfinally;

public class Example2 {
    public static void main(String[] args) {
        try {
            System.out.println("HI 1");
            System.out.println("HI 2");
            throw new StackOverflowError("Error occured"); // Will not terminate the program.
        } catch (Throwable t) { // Thrown error will be catched in this block.
            System.out.println("Caught error: " + t.getMessage());
        }
    }
}
