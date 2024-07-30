import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        DBHelper dbHelper = new DBHelper();
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = dbHelper.getConnection();
            System.out.println("Connected");

            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from city where name = 'Ardahan'");

            while (resultSet.next())
            {
                System.out.println("City Name: " + resultSet.getString("name"));
            }
        }
        catch (SQLException exception){
            dbHelper.getErrorMessage(exception);
        }
        finally {
            try {
                connection.close();
                System.out.println("Disconnected");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}