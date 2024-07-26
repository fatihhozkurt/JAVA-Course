public class ProductManager {

    public void addProduct(Product product) {
        System.out.println(product.get_name() + " added.");
    }

    public void deleteProduct(Product product) {
        System.out.println(product.get_name() + " deleted.");
    }


    public void updateProduct(Product product) {
        System.out.println(product.get_name() + " updated.");
    }
}


