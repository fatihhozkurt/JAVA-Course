public class CustomerManager{

    public BaseDatabaseManager _baseDatabaseManager;

    public CustomerManager(BaseDatabaseManager baseDatabaseManager)
    {
        _baseDatabaseManager = baseDatabaseManager;
    }

    public void getCustomers()
    {
        _baseDatabaseManager.getData();
    }
}
