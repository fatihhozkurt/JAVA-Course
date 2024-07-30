import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        DBHelper dbHelper = new DBHelper();
        PreparedStatement preparedStatement = null;

        try {
            connection = dbHelper.getConnection();
            System.out.println("Connected");

            String sqlQuery = "update city set population = ?, name = ? where name = ?";
            preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1,20);
            preparedStatement.setString(2,"Ardahan Cumhuriyeti");
            preparedStatement.setString(3,"Ardahan");


            preparedStatement.executeUpdate();

            System.out.println("Record updated");

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