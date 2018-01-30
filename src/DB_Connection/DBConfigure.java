/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Thilina Prasad
 */
public class DBConfigure {
    final static private String DB = "biometric";
    final static private String DB_USER = "root";
    final static private String DB_PASS = "";
    public static Connection ConnectToDB(){
        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:lib//biometric.db";
            // create a connection to the database
            
            Connection conn = DriverManager.getConnection(url);
            
           System.out.println("Connection to SQLite has been established.");
            String sql = "CREATE TABLE IF NOT EXISTS user ( id int(4) PRIMARY KEY," +
"  name varchar(100) NOT NULL," +
"  key_pressed varchar(50) NOT NULL," +
"  key_fly varchar(50) NOT NULL," +
"  tot_time varchar(50) NOT NULL," +
"  fullName varchar(250) NOT NULL," +
"  age varchar(3) NOT NULL)";
            Statement stmt = conn.createStatement();
            stmt.execute(sql);         
            return conn;
        } catch (Exception e) {
            System.out.println("Connection Not Successful!");
            return null;
        }
    }
    
}
