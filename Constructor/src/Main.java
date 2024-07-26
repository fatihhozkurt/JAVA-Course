//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1,"Tv","Just Tv", "231a", 24455, 5);
        ProductManager productManager = new ProductManager();

        System.out.println("Name : " + product1.get_name() + "\n" + "Code: " +  product1.get_code() + "\n" + "Amount: " +  product1.get_amount() + "\n" + "ID: " + product1.get_id() + "\n" + "Description: " + product1.get_description() + "\n" + "Price: " + product1.get_price());
    }
}