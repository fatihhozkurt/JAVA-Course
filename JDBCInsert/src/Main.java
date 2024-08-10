import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement statement = null;
        DBHelper dbHelper = new DBHelper();

        String sql = "insert into city (Name,CountryCode,District) values (?,?,?)";

        try {
            connection = dbHelper.getConnection();

            statement = connection.prepareStatement(sql);

            statement.setString(1,"Adalar");
            statement.setString(2,"TUR");
            statement.setString(3,"Adalar Sahili");

            statement.executeUpdate();
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