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
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StudentFess extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6;
    JTable tbl1;
    JButton b1,b2,b3;
    StudentFess(){
        
        l7=new JLabel("Student Fees");
        l7.setBounds(50,0,1000,35);
        l7.setForeground(Color.red);
        l7.setFont(new Font("Tahoma",Font.BOLD,18));
        add(l7);
        
        setUndecorated(true);
        
        tbl1=new JTable();
        tbl1.setBounds(50,400,350,100);
        add(tbl1);
        
        l1=new JLabel("Student ID");
        l1.setBounds(50,50,100,35);
        add(l1);
        
        t1=new JTextField();
        t1.setBounds(180,50,80,35);
        add(t1);
        
        b1=new JButton("Search");
        b1.setBounds(270,50,110,35);
        add(b1);
        
        
        l2=new JLabel("Name");
        l2.setBounds(50,100,100,35);
        add(l2);
        
        t2=new JTextField();
        t2.setBounds(180,100,200,35);
        add(t2);
        
        l3=new JLabel("Email");
        l3.setBounds(50,150,100,35);
        add(l3);
        
        t3=new JTextField();
        t3.setBounds(180,150,200,35);
        add(t3);
        
        l4=new JLabel("Bank AccNo.");
        l4.setBounds(50,200,100,35);
        add(l4);
        
        t4=new JTextField();
        t4.setBounds(180,200,200,35);
        add(t4);
        
        l5=new JLabel("Month");
        l5.setBounds(50,250,100,35);
        add(l5);
        
        t5=new JTextField();
        t5.setBounds(180,250,200,35);
        add(t5);
        
        l6=new JLabel("Account To be paid");
        l6.setBounds(50,300,150,35);
        add(l6);
        
        t6=new JTextField();
        t6.setBounds(180,300,200,35);
        add(t6);
        
        b2=new JButton("Save");
        b2.setBounds(100,350,100,35);
        b1.addActionListener(this);
        add(b2);
        
        b2=new JButton("Clear");
        b2.setBounds(230,350,100,35);
        add(b2);
        
        
        getContentPane().setBackground(Color.CYAN); 
        setBounds(430,120,470,550);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            JOptionPane.showMessageDialog(null, "Fees Saved Sucessfully!!");
        }
    }
    public static void main(String args[]){
        new StudentFess().setVisible(true);
    }
}
