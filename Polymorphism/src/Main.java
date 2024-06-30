//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BaseLogger[] baseLoggers = new BaseLogger[]{new DatabaseLogger(), new EmailLogger(), new ConsoleLogger(), new FileLogger()};

        for (BaseLogger logsIndex: baseLoggers)
        {
            logsIndex.log("Log message");
        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());

        customerManager.add();
    }
}