public class CustomerManager {

    private ICustomerDal _customerDal;

    public CustomerManager(ICustomerDal customerDal)
    {
        _customerDal = customerDal;
    }

    public void addCustomer()
    {
        _customerDal.addToDatabase();
    }

}
