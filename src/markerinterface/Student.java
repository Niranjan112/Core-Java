package markerinterface;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

}
