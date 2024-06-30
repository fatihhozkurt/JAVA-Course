public class ProductManager {

    public String add(Product product) {
        return product.getName() + " added.";
    }

    public String delete(Product product) {
        return product.getName() + " deleted.";
    }

    public String update(Product product) {
        return product.getName() + " updated.";
    }
}
