public class CustomerManager {

    BaseLogger _logger;

    public CustomerManager(BaseLogger logger)
    {
        _logger = logger;
    }

    public void add()
    {
        System.out.println("Customer added");
        _logger.log("log message");
    }
}
