import com.sun.tools.jconsole.JConsoleContext;

public class CustomerManager {

    public CustomerManager(BaseLogger logger)
    {
        _logger = logger;
    }

    private BaseLogger _logger;

    public void add()
    {
        System.out.println("Customer added.");
        _logger.log("Log message");
    }


}
