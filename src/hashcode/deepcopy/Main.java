package hashcode.deepcopy;

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

    public Employee getCloneObject() throws CloneNotSupportedException{
        Employee clonedEmployee = (Employee) this.clone();

        // Replacing referred arraylist in cloned object with new arraylist. Hence, achieving deep copy.
        // Note: Deep copy also can be done by overriding clone method.
        clonedEmployee.hobbies = new ArrayList<>(clonedEmployee.hobbies);
        return clonedEmployee;
    }
}
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * When we copy a object which result in another same object with same values and
         * also if that object contains another object then create a another copy of that object as well.
         * This is where we copy each field from the original object to the copied object,
         * but as we do so, we perform a deep copy of those instead of just copying the references
         * */
        Employee e1 = new Employee(1, "Niranjan", new ArrayList<>(List.of("Cricket", "Football")));
        System.out.println(e1);

        Employee e2 = e1.getCloneObject(); // Doing deep copy
        System.out.println(e2);

        /**
         * Added Workout to e1's hobbies but didn't reflect in e2 hobbies. As this time we did deep copy.
         * */
        e1.getHobbies().add("Workout");
        System.out.println(e1);
        System.out.println(e2);
    }
}
