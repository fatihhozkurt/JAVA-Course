//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MyList<String> cities = new MyList<String>();
        MyList<Integer> numbers = new MyList<Integer>();
        MyList<Customer> customers = new MyList<Customer>();

        Customer customer = new Customer();

        cities.add("İstanbul");
        numbers.add(2);
        customers.add(customer);


    }
}