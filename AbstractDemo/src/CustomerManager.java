public class CustomerManager{

    BaseDatabaseManager baseDatabaseManager;

    public CustomerManager(BaseDatabaseManager baseDatabaseManager)
    {
        this.baseDatabaseManager = baseDatabaseManager;
    }

    public void getCustomer()
    {
        System.out.println("Customer info");
        baseDatabaseManager.getData();

    }


}
