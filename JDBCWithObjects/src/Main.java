import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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

            ArrayList<Cities> cities = new ArrayList<Cities>();

            while (resultSet.next())
            {
                cities.add(new Cities(resultSet.getString("Name"), resultSet.getString("CountryCode"), resultSet.getString("District")));
                cities.add(new Cities(resultSet.getString("Name"), resultSet.getString("CountryCode"), resultSet.getString("District")));
                cities.add(new Cities(resultSet.getString("Name"), resultSet.getString("CountryCode"), resultSet.getString("District")));
            }

            System.out.println(cities.size());
        }
        catch (SQLException sqlException){
            dbHelper.getErrorMessage(sqlException);
        }
        finally {
            try {
                connection.close();
                System.out.println("Disconnected");
            }
            catch (SQLException sqlException) {
                dbHelper.getErrorMessage(sqlException);
            }
        }



    }
}