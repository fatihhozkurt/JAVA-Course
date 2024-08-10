public class ConsoleLogger extends BaseLogger {

    @Override
    public void log(String logMessage)
    {
        System.out.println("Console Log: " + logMessage);
    }

}
