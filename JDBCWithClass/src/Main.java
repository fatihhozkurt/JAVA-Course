import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        dbHelper helper = new dbHelper();

        try
        {
            connection = helper.getConnection();
            System.out.println("Connected");
        }
        catch (SQLException exception)
        {
            helper.getErrorMessages(exception);
        }
        finally
        {
            try
            {
                connection.close();
                System.out.println("Disconnected");
            }
            catch (SQLException exception)
            {
                throw new RuntimeException(exception);
            }
        }
    }
}