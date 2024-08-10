import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        DBHelper dbHelper = new DBHelper();
        String sql = "select * from city";

        try {
            connection = dbHelper.getConnection();
            System.out.println("Connected");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            ArrayList<Cities> cities = new ArrayList<Cities>();

            while (resultSet.next())
            {
                cities.add(new Cities(resultSet.getString("Name"),resultSet.getString("CountryCode"),resultSet.getString("District")));
                cities.add(new Cities(resultSet.getString("Name"),resultSet.getString("CountryCode"),resultSet.getString("District")));
                cities.add(new Cities(resultSet.getString("Name"),resultSet.getString("CountryCode"),resultSet.getString("District")));
            }
        }
        catch (SQLException exception){
            dbHelper.getError(exception);
        }
        finally {
            try {
                statement.close();
                connection.close();
                System.out.println("Disconnected");
            }
            catch (SQLException exception){
                dbHelper.getError(exception);
            }
        }
    }
}