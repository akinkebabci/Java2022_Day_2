import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();


        customers.add(new Customer(1, "Akın", "Kebabcı"));
        customers.add(new Customer(2, "Hasan", "Gurer"));
        customers.add(new Customer(3, "Yüksel", "Gurer"));


        for (Customer customer:customers) {
            System.out.println(customer.firstName);
        }
    }
}