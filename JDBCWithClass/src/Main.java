import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Connection connection = null;
        dbHelper db = new dbHelper();

        try {
            connection = db.getConnection();
            System.out.println("Connected");
        }
        catch (SQLException exception){
            db.getErrorMessage(exception);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException exception) {
                db.getErrorMessage(exception);
            }
        }
    }
}