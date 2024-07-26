public class CustomerValidator {

    public static boolean valid(Customer customer)
    {
        if (customer.get_surname().isEmpty() || customer.get_name().isEmpty() || customer.get_id()<1 || customer.get_age()<18)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
