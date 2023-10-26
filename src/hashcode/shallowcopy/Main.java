package hashcode.shallowcopy;

import java.util.ArrayList;
import java.util.List;

class Employee implements Cloneable {
    private int id;
    private String name;

    private List<String> hobbies;

    public Employee(int id, String name, ArrayList<String> hobbies) {
        this.id = id;
        this.name = name;
        this.hobbies = hobbies;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                ", hashcode='" + this.hashCode() + '\'' +
                '}';
    }

    public Employee getCloneObject() throws CloneNotSupportedException {
        return (Employee) this.clone(); // clone method return shallow copy. It's the default behaviour.
    }
}
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * When we copy a object which result in another same object with same values but if that object contains another object then only it's referenced is shared or copied.
         * Below is an example of object copying.
         * */
        Employee e1 = new Employee(1, "Niranjan", new ArrayList<>(List.of("Cricket", "Football")));
        System.out.println(e1);

        Employee e2 = e1.getCloneObject(); // Doing shallow copy
        System.out.println(e2);

        e1.getHobbies().add("Workout");
        /**
         * Employee object contains another object hobbies which is a List.
         * hobbies doesn't get copied instead the reference got copied or shared.
         * Changes done on e1 hobbies will reflect on e2 hobbies as well.
         * This is shallow copy example
         * */
        System.out.println(e1);
        System.out.println(e2);
    }
}
