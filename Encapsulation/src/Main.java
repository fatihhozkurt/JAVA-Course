//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        ProductManager productManager1 = new ProductManager();

        product1.set_amount(2);
        product1.set_name("TV");
        product1.set_id(3);
        product1.set_price(1000);
        product1.set_description("Bildiğin tv");
        product1.set_code("234a");

        System.out.println("Name : " + product1.get_name() + "\n" + "Code: " +  product1.get_code() + "\n" + "Amount: " +  product1.get_amount() + "\n" + "ID: " + product1.get_id() + "\n" + "Description: " + product1.get_description() + "\n" + "Price: " + product1.get_price());
    }
}