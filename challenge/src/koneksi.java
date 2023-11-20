/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tribayuu
 */
    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {

public class DatabaseConnection {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/data login";
    private static final String DB_USER = "username_database";
    private static final String DB_PASSWORD = "password_database";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            return null;
        }
    }
}
    
}
