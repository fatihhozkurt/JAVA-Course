//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Customer customer = new Customer(1,"Fatih", "Özkurt", 25);
    CustomerManager customerManager = new CustomerManager();

    customerManager.add(customer);
    customerManager.update(customer);
    customerManager.delete(customer);
    }
}