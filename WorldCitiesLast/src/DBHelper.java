import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fatih
 */
public class DBHelper {

    private String username = "root";
    private String password = "18668798";
    private String dbURL = "jdbc:mysql://localhost:3306/world";
    
    public Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(dbURL,username,password);
    }
    
    public void getErrors(SQLException exception)
    {
        System.out.println("Exception: " + exception.getMessage());
        System.out.println("Code: " + exception.getErrorCode());
    }
}