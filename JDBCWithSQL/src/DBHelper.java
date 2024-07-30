import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

    private String userName = "root";
    private String userPassword = "18668798";
    private String dbURL = "jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbURL,userName,userPassword);
    }

    public void getErrorMessage(SQLException exception)
    {
        System.out.println("Exception: " + exception.getMessage());
        System.out.println("Code: " + exception.getErrorCode());
    }
}
