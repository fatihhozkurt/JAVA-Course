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

            String sqlQuery = "delete from city where name = ?";
            preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1,"Ardahan 2");
            preparedStatement.executeUpdate();

            System.out.println("Deleted");
        }
        catch (SQLException sqlException){
            dbHelper.getErrorMessage(sqlException);
        }
        finally {
            try {
                connection.close();
                preparedStatement.close();
                System.out.println("Disconnected");
            }
            catch (SQLException sqlException){
                dbHelper.getErrorMessage(sqlException);
            }
        }
    }
}