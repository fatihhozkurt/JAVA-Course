//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,"Laptop","Lenovo Ideapad Gaming 3", "L", 25000.00, 16);
        ProductManager productManager = new ProductManager();

        System.out.println(productManager.add(product));
        System.out.println(productManager.delete(product));
        System.out.println(productManager.update(product));
    }
}