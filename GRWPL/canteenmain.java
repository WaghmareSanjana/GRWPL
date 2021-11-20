/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grwplinstitutemanagementsystem;

/**
 *
 * @author LENOVO
 
 * /
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class canteenmain extends JFrame implements ActionListener{
    
    JButton b1,b2,b3,b4,b5,b6;
   canteenmain(){
       setUndecorated(true);
       
       
    
     b1=new JButton("Login");
     b1.setBounds(30,50,200,40);
     b1.addActionListener(this);
     b1.setBackground(Color.red);
     add(b1);
     
      b2=new JButton("Menu");
     b2.setBounds(30,120,200,40);
     b2.addActionListener(this);
     b2.setBackground(Color.green);
     add(b2);
     
     b3=new JButton("Bill");
     b3.setBounds(30,190,200,40);
     b3.addActionListener(this);
     b3.setBackground(Color.pink);
     add(b3);
     

    getContentPane().setBackground(Color.BLACK); 
    setBounds(500,100,300,350);
    setLayout(null);
    
    
    
}
   public void actionPerformed(ActionEvent ae)
   {
       if(ae.getSource()==b1){
           new CLogin().setVisible(true);
       }
       else if(ae.getSource()==b2){
           new Canteen_Menu().setVisible(true);
       }
       else if(ae.getSource()==b3){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }
            catch(Exception e){
                
            }
       }
   }
public static void main(String args[]){
new canteenmain().setVisible(true);
}
}