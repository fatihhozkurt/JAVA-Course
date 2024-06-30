//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        EmployeeManager employeeManager = new EmployeeManager();
        Customer customer = new Customer();
        CustomerManager customerManager = new CustomerManager();
        Person person = new Person();

        System.out.println("Customer: ");
        System.out.println(customer.name);
        customerManager.add();

        System.out.println("Employee: ");
        System.out.println(employee.name);
        employeeManager.add();
    }
}