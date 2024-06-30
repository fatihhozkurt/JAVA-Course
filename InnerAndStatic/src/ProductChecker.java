public class ProductChecker {

    public static boolean check(Product product)
    {
        if (!product.productName.isEmpty() && product.productPrice>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
