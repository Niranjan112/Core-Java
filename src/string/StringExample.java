package string;

public class StringExample {
    public static void main(String[] args) {
        // Below referring to same object in string pool.
        String one = "java";
        String two = "java";

        // Below referring to different object which in Heap memory.
        String three = new String("java");

        // Below referring to same object which is created on line 6/7 in String pool.
        // As intern method force it to be on String pool.
        String four = new String("java").intern();

        System.out.println(one == two); // true
        System.out.println(one == "java"); // true

        /**
         * one == three compares the references of the two objects,
         * and since they are different objects, the expression will return false
         * */
        System.out.println(one == three); // false
        /**
         * one.equals(three) compares the content of the two objects, which are both the string "java".
         * Therefore, this expression will return true
         * As three is stored in heap memory not in String pool.
         * */
        System.out.println(one.equals(three)); // true



        System.out.println(one.hashCode());
        System.out.println(two.hashCode());

        /**
         * The hashCode() method returns an integer that represents the hash code value of the object.
         * The hash code of a String object is calculated based on the content of the string.
         * Therefore, since all four variables contain the same string "java", their hash codes will be equal.
         * Address/hashcode is same but memory area is different.
         * */
        System.out.println(three.hashCode());

        System.out.println(four.hashCode());
    }
}
