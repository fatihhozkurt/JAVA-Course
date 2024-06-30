//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        ProductManager productManager = new ProductManager();

        product.productName = "Nothing Phone 2a";
        product.productPrice = 1500.00;
        product.productID = 1;

        productManager.add(product);
    }
}