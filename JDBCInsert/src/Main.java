import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        DBHelper dbHelper = new DBHelper();
        PreparedStatement preparedStatement = null;

        try {
            connection = dbHelper.getConnection();
            System.out.println("Connected");

            String sqlQuery = "insert into city (Name,CountryCode,District,Population) values (?,?,?,?)";
            preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1,"Bongomya");
            preparedStatement.setString(2,"TUR");
            preparedStatement.setString(3,"East Anatolia");
            preparedStatement.setInt(4,80000);

            preparedStatement.executeUpdate();

            System.out.println("Record added");
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