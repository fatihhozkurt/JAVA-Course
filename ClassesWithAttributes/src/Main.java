//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        ProductManager productManager = new ProductManager();

        product1.id = 1;
        product1.name = "Laptop";
        product1.description = "Lenovo Ideapad Gaming 3";
        product1.price = 25000.99;
        product1.amount = 85;

        productManager.addProduct(product1);
    }
}