public class CustomerManager {

    BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger)
    {
        this.baseLogger = baseLogger;
    }

    public void add()
    {
        System.out.println("Added");
        baseLogger.log("Add method log message");
    }

    public void delete()
    {
        System.out.println("Deleted");
        baseLogger.log("Delete method log message");
    }
}