/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joudalghamdi
 */
public class Database_connection {
    
    String server_url = "jdbc:mysql://localhost:3306/users?CPIT455";
    String username = "root";
    String password = "12344321";
    Connection conn = null;
    PreparedStatement prepared_statement = null;
    ResultSet result_set = null;
    String sql_query = "";
       
    public Database_connection() {
    
        try {
            
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(server_url, username, password);
        
        } 
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error in the connection");
        }
    }
    
    public ResultSet getMyInfo(){
        sql_query = "SELECT * FROM JoudAlghamdi;";
        
        try {
            prepared_statement = conn.prepareStatement(sql_query);
            result_set = prepared_statement.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Couldn't get my info");
        }
        
        return result_set;

    }
    
    
}
