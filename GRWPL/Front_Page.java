/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grwplinstitutemanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

class Front_Page extends JFrame implements ActionListener{
    JFrame f; 
    JLabel id,l1;
    JButton b;

    Front_Page(){
 
        
        setBackground(Color.red);
        setLayout(null);
        
        setUndecorated(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("GRWPLInstituteManagementSystem/icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        
        l1.setBounds(0,100,1360,530);
        add(l1);


        b = new JButton("NEXT");
        b.setBackground(Color.RED);
        b.setForeground(Color.WHITE);
        b.setBounds(1150,40,100,35);
        b.addActionListener(this);
       
        id=new JLabel();
        id.setBounds(0,0,1200,500);
        id.setLayout(null);
        
   

        JLabel lid=new JLabel("GRWPL Staff MANAGEMENT SYSTEM");
        lid.setBounds(0,0,1100,100);
        lid.setFont(new Font("serif",Font.BOLD,60));
        lid.setForeground(Color.WHITE);
        id.add(lid);

        add(b);
        add(id);
        
        
        getContentPane().setBackground(Color.RED);

        setVisible(true);
        setSize(1400,750);
        setLocation(0,0);

    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            this.setVisible(false);
            new stafflogin();    
        }
    }

    public static void main(String[] arg){
      new Front_Page().setVisible(true);
    }
}