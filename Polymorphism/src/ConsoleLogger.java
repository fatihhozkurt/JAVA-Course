public class ConsoleLogger extends BaseLogger {

    public void log(String message) {
        System.out.println("Logged by ConsoleLogger: " + message);
    }
}
