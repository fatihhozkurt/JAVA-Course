import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static String userName = "root";
    static String password = "186618798";
    static String dbURL = "jdbc:mysql://localhost:3306/world";

    public static void main(String[] args) {

        Connection mySQLConnection = null;

        try {
            mySQLConnection = DriverManager.getConnection(dbURL,userName,password);
            System.out.println("Connected");
        }
        catch (SQLException exception)
        {
            throw new RuntimeException(exception);
        }
        finally {
            try
            {
                mySQLConnection.close();
                System.out.println("Disconnected");
            }
            catch (SQLException exception)
            {
                throw new RuntimeException(exception);
            }
        }
    }
}