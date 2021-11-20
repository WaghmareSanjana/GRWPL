/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grwplinstitutemanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
    
public class GrwplCollege extends JFrame implements ActionListener{
  JButton b1;
    GrwplCollege(){

         setBounds(100,0,1000,700);
        setLayout(new FlowLayout());
        
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("GRWPLInstituteManagementSystem/icons/home.jpeg"));
        Image i1 = c1.getImage().getScaledInstance(1000, 700,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);    
        JLabel m1 = new JLabel(i2);
        add(m1);
     
        b1=new JButton("Lets go!!");
        b1.setBounds(500,600,100,35);
        b1.addActionListener(this);
        m1.add(b1);
        
        setUndecorated(true);
       
       
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try{
            this.setVisible(false);
            GLogin l = new GLogin();
            l.setVisible(true);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String args[]){
        
       new GrwplCollege().setVisible(true);
    }
}
