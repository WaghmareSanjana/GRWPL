/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grwplinstitutemanagementsystem;

/**
 *
 * @author LENOVO
 */
import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    public conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///GRWPLInstituteManagementSystem","root","13january2004");
            s=c.createStatement();
        } catch (Exception e) {
                  e.printStackTrace();

        }
        
    }
     public static void main(String args[]){
        
    }
    
}
