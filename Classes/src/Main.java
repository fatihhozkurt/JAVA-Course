//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager;
        CustomerManager customerManager1 = new CustomerManager();
        customerManager = customerManager1;

        System.out.println("customerManager:");
        customerManager.add();
        customerManager.delete();
        customerManager.update();
        System.out.println("\n----------------\n");
        System.out.println("customerManager1:");
        customerManager1.add();
        customerManager1.delete();
        customerManager1.update();
    }
}