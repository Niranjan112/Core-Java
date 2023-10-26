package override;

class Parent {
    Number operation(int a, int b) {
        System.out.println("From Parent");
        return (a + b);
    }

    static void print() {
        System.out.println("statice method from parent");
    }
}

class Child extends Parent {
    Integer operation(int a, int b) {
        System.out.println("From Child");
        return a + b;
    }

    static void print() {
        System.out.println("static method from child");
    }

    void justPrinting() {
        System.out.println("Just printing");
    }
}

public class Example1 {
    public static void main(String[] args) {
        // Example of Co variant return type in method over riding.
        /**
        * Covariant return type refers to return type of an overriding method.
        * It allows to narrow down return type of an overridden method without any need to cast the type or check the return type.
        * Covariant return type works only for non-primitive return types.
         * Over ridden method can have subclass as return type of parent method's return type.
         * In this example, we are returning Number which is parent class of Integer.
         * and in Child overridden method we are returning Integer.
        * */

        Parent child = new Child();
        System.out.println(child.operation(1,2));

        System.out.println("===============================\n");

        // Static method over ride.
        Parent.print();
        Child.print(); // child static method will be printed.

    }
}
