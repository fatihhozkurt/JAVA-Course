import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

    private String userName = "root";
    private String password = "18668798";
    private String dbURL = "jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(dbURL,userName,password);
    }

    public void getErrorMessage(SQLException sqlException)
    {
        System.out.println("Exception: " + sqlException.getMessage());
        System.out.println("Code: " + sqlException.getErrorCode());
    }
}