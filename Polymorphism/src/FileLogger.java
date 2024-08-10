public class FileLogger extends BaseLogger {

    @Override
    public void log(String logMessage)
    {
        System.out.println("File Log: " + logMessage);
    }
}
