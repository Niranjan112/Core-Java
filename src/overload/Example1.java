package overload;

class Test1 {
    public void m1(Object o) {
        System.out.println("Object");
    }
    public void m1(String s) {
        System.out.println("String");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.m1(new Object());
        test1.m1("Niranjan");
        test1.m1(null);

        /**
         * Java will always choose the most specific version of the method that matches the argument type.
         *
         * In this case, since null can be a String (as well as an Object),
         * the m1 method that takes a String parameter is more specific than the one that takes an Object parameter, so it is chosen.
         *
         * Therefore, when test1.m1(null) is called,
         * the m1 method that takes a String parameter is invoked, and "String" is printed to the console.
         * */
    }
}
