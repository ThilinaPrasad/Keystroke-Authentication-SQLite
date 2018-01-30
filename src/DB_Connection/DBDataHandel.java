package DB_Connection;

import DB_Connection.DBConfigure;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thilina Prasad
 */
public class DBDataHandel {

    public ArrayList<String> getData(String userName) {
        Connection ConnectToDB = DBConfigure.ConnectToDB();
        ArrayList<String> val = new ArrayList<>();
        try {
            PreparedStatement pst = ConnectToDB.prepareStatement("SELECT * FROM user WHERE name=? LIMIT 1");
            pst.setString(1, userName);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                val.add(rs.getString(1));
                val.add(rs.getString(2));
                val.add(rs.getString(3));
                val.add(rs.getString(4));
                val.add(rs.getString(5));
                val.add(rs.getString(6));
                val.add(rs.getString(7));
                //System.out.println(val.toString());
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBDataHandel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return val;

    }

    public boolean storeData(String uname, String pressed, String released, String tot,String fName,String age) {
        try {
            Connection ConnectToDB = DBConfigure.ConnectToDB();
            String query = "INSERT INTO user(name,key_pressed,key_fly,tot_time,fullName,age) VALUES(?,?,?,?,?,?)";
            PreparedStatement pst = ConnectToDB.prepareStatement(query);
            pst.setString(1, uname);
            pst.setString(2, pressed);
            pst.setString(3, released);
            pst.setString(4, tot);
            pst.setString(5, fName);
            pst.setString(6, age);
            return pst.execute();

        } catch (SQLException ex) {
            return true;

        }

    }
    
    public boolean updateData(String uname, String pressed, String released, String tot) {
        try {
            Connection ConnectToDB = DBConfigure.ConnectToDB();
            //String query = "INSERT INTO user(name,key_pressed,key_fly,tot_time,fullName,age) VALUES(?,?,?,?,?,?)";
            String query = "UPDATE user SET key_pressed=?,key_fly=?,tot_time=? WHERE name=?";
            PreparedStatement pst = ConnectToDB.prepareStatement(query);
            pst.setString(1, pressed);
            pst.setString(2, released);
            pst.setString(3, tot);
            pst.setString(4, uname);
            return pst.execute();

        } catch (SQLException ex) {
            return true;

        }

    }

}
