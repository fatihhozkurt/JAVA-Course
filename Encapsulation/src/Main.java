//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        ProductManager productManager = new ProductManager();

        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Lenovo Ideapad Gaming 3");
        product.setPrice(25000.0);
        product.setAmount(16);

        System.out.println("Product Information:\n" + "Product ID: " + product.getId() + "\n" + "Product Name: " + product.getName() + "\n" + "Product Description: " + product.getDescription() + "\n" + "Product Price: " + product.getPrice() + "\n" + "Product Amount: " + product.getAmount());

        System.out.println("\n");
        System.out.println(productManager.add(product));
        System.out.println(productManager.delete(product));
        System.out.println(productManager.update(product));
    }
}