package override;

import java.sql.SQLException;

class ParentEx3 {
    public void test(String id) throws SQLException {
        System.out.println(id);
    }
}

class ChildEx3 extends ParentEx3 {
    public void test(int id) {
        System.out.println(id);
    }
}

public class Example3 {
    public static void main(String[] args) throws SQLException {
        ChildEx3 childEx1 = new ChildEx3();
        childEx1.test(1);
        childEx1.test("2");
    }
}
