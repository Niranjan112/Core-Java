package hashcode;

class Demo {
    int a = 1;
    int b = 2;

    @Override
    public int hashCode() {
        return a+b;
    }
}
public class HashCodeChangeEx {
    public static void main(String[] args) {
        /**
         * If hashcode generation depends on object variable for example a,b here.
         * And then we change any of the object variable then hashcode will also change.
         * */
        Demo demo = new Demo();
        System.out.println("Intial hashcode: \n" + demo.hashCode());
        demo.a = 2;
        System.out.println("Changed hashcode after changing value of a: \n" + demo.hashCode());

    }
}
