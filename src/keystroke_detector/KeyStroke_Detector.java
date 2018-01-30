/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keystroke_detector;

import DB_Connection.DBConfigure;
import DB_Connection.DBDataHandel;
import Interfaces.LogIn;

/**
 *
 * @author Thilina Prasad
 */
public class KeyStroke_Detector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DBDataHandel dbdata = new DBDataHandel();
        //dbdata.getData("SELECT * FROM user");
        LogIn logIn =  new LogIn();
        logIn.setVisible(true);
    }
    
}
