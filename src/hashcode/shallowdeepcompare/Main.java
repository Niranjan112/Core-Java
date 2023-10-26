package hashcode.shallowdeepcompare;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        /**
         * There are two types of object comparison in java – shallow and deep.
         * When you use ‘==’ operator, you are comparing the references for equality.
         * It means you are comparing memory addresses of the objects.
         * It is called shallow comparison.
         *
         * When you use .equals() you are comparing the object values themselves for equality.
         * It means you are checking ‘do both objects have same value for corresponding instance variables or not ‘.
         * Let’s have an example to understand it better:
         * */

        String person1="James"; // memory address 500
        String person2="James"; //memory address 500 as the value is same
        // Shallow comparison
        if(person1== person2){
            // It will return true, because it is comparing the memory addresses which are same for both the objects
            System.out.println("Success");
        }

        // Deep comparison
        if(person1.equals(person2)){
            //It will return true, because it is comparing the object values which are again same for both
            System.out.println("Success");
        }

        person2 = new String("James"); //James now has a new memory address for eg: 2545
        // Shallow comparison
        if(person1== person2){
            // It will return false, because it is comparing the memory addresses which are same but their memory area is different.
            System.out.println("Success");
        }



        // Deep comparison
        if(person1.equals(person2)){
            //It will return true, because it is comparing the object values which are again same for both
            System.out.println("Success");
        }

        Employee e1 = new Employee(1, "Niranjan");
        Employee e2 = e1;
        Employee e3 = new Employee(1, "Niranjan");

        System.out.println("Shallow compare: " + (e1 == e2)); // Returns true as reference is same
        System.out.println("Deep compare: " + (e1.equals(e2))); // Returns true as all values of instance variable is same.

        System.out.println("Shallow compare: " + (e1 == e3)); // Returns false as reference is not same
        System.out.println("Deep compare: " + (e1.equals(e3))); // Returns false as all values of instance variable are not same differ in hashcode,etc.
    }
}
