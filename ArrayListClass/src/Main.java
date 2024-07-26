import java.beans.PropertyEditorManager;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1,"Fatih","Özkurt"));
        customers.add(new Customer(2,"Seda Nur","Özalpdemir"));
        customers.add(new Customer(3,"Petek Mislina", "Aydın"));

        Customer baris = new Customer(4,"Barış", "Ateş");
        customers.add(baris);
        customers.remove(baris);


        for (Customer customerIndex : customers)
        {
            System.out.println(customerIndex.get_name());
        }

    }
}