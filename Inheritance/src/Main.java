//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        EmployeeManager employeeManager = new EmployeeManager();
        Customer customer = new Customer();
        CustomerManager customerManager = new CustomerManager();
        Person person = new Person();
        PersonManager personManager = new PersonManager();

        System.out.println(employee.name);


        System.out.println("Customer: " + customer.name);
        customerManager.add();

        System.out.println("Employee: " + employee.name);
        employeeManager.delete();
    }
}