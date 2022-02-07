package Config;

import java.sql.*;

public class DBConnection {
    
    private static Connection MYSQLConfig;

    public static Connection DBConnection(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jedidta_iventori";
            String user = "root";
            String password = "";
            
            MYSQLConfig = DriverManager.getConnection(url, user, password);
             
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Failed connect to database");
        }
        
        return MYSQLConfig;
    }
    
}
