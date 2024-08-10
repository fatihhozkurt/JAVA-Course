public class CustomerManager {

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal)
    {
        this.customerDal = customerDal;
    }

    public void addCustomer()
    {
        System.out.println("Added");
        customerDal.addToDatabase();
    }
}
