import java.util.HashMap;
import java.util.Objects;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }


        if (!(obj instanceof Employee)) {
            return false;
        }

        Employee emp = (Employee) obj;


        return this.id == emp.getId() && this.name.equals(emp.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

/**
 * Try this with and without overriding hashCode() in Employee class.
 *
 * Hashmap only replace the value on below conditions:
 * 1. If new key object references are same with old key object.
 * 2. If we use equals method which return true and their hashcode are same.
 *
 * Note: If equals method return true but their hashcodes are different
 * then also hashmap will not replace with new value. And it will add it as new key:value pairs element.
 *
 * You should override hashCode() method as well to return same hash code value.
 * */
public class Practice {
    public static void main(String[] args) {
        HashMap<Employee, Integer> hashMap = new HashMap<>();
        Employee emp1 = new Employee(1, "ABC");
        Employee emp2 = new Employee(2, "XYZ");
        Employee emp3 = new Employee(1, "ABC");

        System.out.println(emp1.equals(emp3));
        System.out.println(emp1.hashCode());
        System.out.println(emp3.hashCode());

        hashMap.put(emp1, 1);
        hashMap.put(emp2, 2);
        hashMap.put(emp3, 3);

        System.out.println(hashMap);
    }
}
