public class ProductManager {

    public void add(Product product)
    {
        if (ProductChecker.check(product))
        {
            System.out.println("Product added succesfully");
        }
        else
        {
            System.out.println("Product add failed succesfully.");
        }
    }
}
