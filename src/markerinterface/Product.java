package markerinterface;

public class Product implements Cloneable {
    int pid;
    String pname;
    double pcost;

    //Product class constructor
    public Product(int pid, String pname, double pcost) {
        this.pid = pid;
        this.pname = pname;
        this.pcost = pcost;
    }

    //method that prints the detail on the console
    public void showDetail() {
        System.out.println("Product ID: " + pid);
        System.out.println("Product Name: " + pname);
        System.out.println("Product Cost: " + pcost);
        System.out.println("Object's hash code: " + this.hashCode());
    }

    public Product getCloneObject(Product product) throws CloneNotSupportedException {
        /**
         * If Cloneable interface is not implemented below clone method call will throw CloneNotSupportedException
         */
        return (Product) product.clone();
    }
}
