public class ProductManager {

    public void add(Product product)
    {
        System.out.println(product.get_name() + " added");
    }

    public void delete(Product product)
    {
        System.out.println(product.get_name() + " deleted");
    }

    public void update(Product product)
    {
        System.out.println(product.get_name() + " updated");
    }
}
