import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        DBHelper dbHelper = new DBHelper();

        try {
            connection = dbHelper.getConnection();
            System.out.println("Connected");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from city");

            while (resultSet.next())
            {
                System.out.println("Name: " + resultSet.getString("Name"));
            }
        }
        catch (SQLException exception){
            dbHelper.getErrorMessage(exception);
        }
        finally {
            try {
                statement.close();
                connection.close();
                System.out.println("Connection closed.");
            }
            catch (SQLException exception){
                dbHelper.getErrorMessage(exception);
            }

        }


    }
}