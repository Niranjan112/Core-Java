package markerinterface;

import java.io.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Cloneable markup interface example
        /**
         * Cloneable Interface in Java is a marker interface. It belongs to java.lang package.
         * It is used to create a clone or copy of an object with some other name.
         * If we want to clone the objects of a class, then that class has to implement the Cloneable interface.
         * This is used to indicate the JVM that the clone() method of the Object class can be used by the objects of the class which have implemented the Cloneable Interface.
         * Point to Note: If a class has not implemented the Cloneable Interface,and its objects call the clone() method, then it throws an exception named as CloneNotSupportedException.
         * */
        Product p1 = new Product(1, "Watch", 23.55);
        Product p2 = p1.getCloneObject(p1); // This method calling Object class clone methods.
        p1.showDetail();
        System.out.println("===================================");
        p2.showDetail();
        p2.pname = "New Watch";
        System.out.println("===================================");
        System.out.println("===================================");
        p1.showDetail();
        System.out.println("===================================");
        p2.showDetail();

        boolean b = p1.hashCode() == p2.hashCode();
        System.out.println("\nIs hashcode equals: " + b);






        // Serialization & Deserialization:
        /**
         * Serializable Interface is a Marker Interface in Java, i.e, it is an empty interface as it has no methods, fields or constants, etc. Its definition is present in Java's IO package.
         * Note: Serialization is the process of conversion of the state of an object into a byte stream so that it can be saved on the disk or in a database or shared over a network. On the other hand, deserialization does the opposite, i.e, conversion of a byte stream into an object.
         * Serializable marker interface, makes its objects eligible to be serialized and deserialized.
         * */
        System.out.println("Serialization and Deserialization");
        try {
            // Serialization:
            Student s1 = new Student(1, "Einstein", 95);
            FileOutputStream fos = new FileOutputStream("S1_Info.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush(); // Write the output and flush the stream of data.

            oos.close(); // Close the stream. This will release any resources associated with stream.
            System.out.println("Student Object s1 State saved in File Successfully.");

            // Deserialization:
            FileInputStream fis = new FileInputStream("S1_Info.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s2 = (Student) ois.readObject();
            System.out.println("Student Object State retrieved from File Successfully in Student Object s2.");
            System.out.println(s2.id + " " + s2.name + " " + s2.marks);
            ois.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

