//İnheritance (Miras Alma)
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(); //customer nesnesinde person bilgerlirini intehirt ettiğimizi çin artık ordaki bilgilere erişim sağlayabiliriz
        Employee employee = new Employee(); //Employede Person bilgilerine erişim sağlayabilir
        customer.lastName ="Akın";          //Bunun Gibi customerede lastName Ekleyebilirsin
        employee.lastName = "Mehmet";       //Employee de lastName Ekleyebilirsin

        CustomerMenager customerMenager = new CustomerMenager();
        EmployeeMenager employeeMenager = new EmployeeMenager();

    }
}