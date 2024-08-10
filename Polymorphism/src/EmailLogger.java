public class EmailLogger extends BaseLogger {

    @Override
    public void log(String logMessage)
    {
        System.out.println("Email Log: " + logMessage);
    }
}
