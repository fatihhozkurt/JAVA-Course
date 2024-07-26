public class ProductManager {

    public void add(Product product)
    {
        System.out.println(product.name + " product added.");
    }

    public void delete(Product product)
    {
        System.out.println(product.name + " product deleted.");
    }

    public void update(Product product)
    {
        System.out.println(product.name + " product updated.");
    }
}

