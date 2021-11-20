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
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
public class StudentSection extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4;
    JLabel l1;
    StudentSection(){
        
        l1=new JLabel("STUDENT SECTION");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Tahoma",Font.BOLD,30));
        l1.setBounds(130,10,400,25);
        add(l1);
        
        
        b1=new JButton("Add New Student");
        b1.setBounds(10,100,190,35);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Update And Delete Student");
        b2.setBounds(10,150,190,35);
        b2.addActionListener(this);
        add(b2);
        
        b3=new JButton("Student Fees");
        b3.setBounds(10,200,190,35);
        b3.addActionListener(this);
        add(b3);
        
        JPanel p1=new JPanel();
        p1.setBounds(10,60,200,200);
        add(p1);
        
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("GRWPLInstituteManagementSystem/icons/dash1.jpeg"));
       Image i2=i1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel l1=new JLabel(i3);
       l1.setBounds(250,60,300,300);
       add(l1);
        
       getContentPane().setBackground(Color.BLACK);
        p1.setBorder(new LineBorder(new Color(255, 105, 180), 1, true));
        setBounds(300,100,600,350);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            this.setVisible(false);
            new NewStudent().setVisible(true);
        }
        else if(ae.getSource()==b2){
            this.setVisible(false);
            new UpdateAndDeleteStudent().setVisible(true);
        }
        else if(ae.getSource()==b3){
            this.setVisible(false);
            new StudentFess().setVisible(true);
        }
    }
public static void main(String args[]){
    new StudentSection().setVisible(true);
}    
}
