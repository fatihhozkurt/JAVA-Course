//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1,"Fatih");
        Product product = new Product(2,"Araba");
        Validator validator = new Validator();

        validator.validate(customer);
        validator.validate(product);
    }
}