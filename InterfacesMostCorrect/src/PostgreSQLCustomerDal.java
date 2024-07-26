public class PostgreSQLCustomerDal implements ICustomerDal{

    @Override
    public void addToDatabase() {
        System.out.println("Added to PostgreSQL Database");
    }

}
