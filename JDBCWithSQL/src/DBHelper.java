import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

    private String username = "root";
    private String password = "18668798";
    private String dbURL = "jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(dbURL,username,password);
    }

    public void getErrorMessage(SQLException exception)
    {
        System.out.println("Exception: " + exception.getMessage());
        System.out.println("Code: " + exception.getErrorCode());
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDbURL() {
        return dbURL;
    }
}