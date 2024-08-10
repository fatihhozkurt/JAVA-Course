public class DatabaseLogger extends BaseLogger {

    @Override
    public void log(String logMessage)
    {
        System.out.println("Database Log: " + logMessage);
    }

}
