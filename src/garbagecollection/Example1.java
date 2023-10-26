package garbagecollection;

public class Example1 {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalize executed");
    }

    public static void main(String[] args) {
        Example1 e1 = new Example1();
        Example1 e2 = new Example1();

        e1 = null;
        e2 = null;

        System.gc(); // Runs the garbage collector and finalize method
    }
}
