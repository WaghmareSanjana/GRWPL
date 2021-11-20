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
import java.awt.event.*;
import javax.swing.*;
public class NewStudent extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l10;
    JTextField t1,t2,t3,t4,t5,t6,t7,t18,t19;
    JComboBox ch;
    JButton b1,b2;
    NewStudent(){
        
        l10=new JLabel("New Student Registration!!");
        l10.setBounds(100,0,1000,35);
        l10.setForeground(Color.RED);
        l10.setFont(new Font("Tahoma",Font.BOLD,18));
        add(l10);
        
        setUndecorated(true);
        
        l1=new JLabel("Student ID");
        l1.setBounds(50,50,100,35);
        add(l1);
        
        t1=new JTextField();
        t1.setBounds(180,50,200,35);
        add(t1);
        
        
        l2=new JLabel("Name");
        l2.setBounds(50,100,100,35);
        add(l2);
        
        t2=new JTextField();
        t2.setBounds(180,100,200,35);
        add(t2);
        
        l3=new JLabel("Father Name");
        l3.setBounds(50,150,100,35);
        add(l3);
        
        t3=new JTextField();
        t3.setBounds(180,150,200,35);
        add(t3);
        
        l4=new JLabel("Mother Name");
        l4.setBounds(50,200,100,35);
        add(l4);
        
        t4=new JTextField();
        t4.setBounds(180,200,200,35);
        add(t4);
        
        l5=new JLabel("Email");
        l5.setBounds(50,250,100,35);
        add(l5);
        
        t5=new JTextField();
        t5.setBounds(180,250,200,35);
        add(t5);
        
        l6=new JLabel("Permananet Address");
        l6.setBounds(50,300,150,35);
        add(l6);
        
        t6=new JTextField();
        t6.setBounds(180,300,200,35);
        add(t6);
        
        l7=new JLabel("Branch");
        l7.setBounds(50,350,100,35);
        add(l7);
        
        ch= new JComboBox(new String[] {"Computer", "Electronic", "Civil", "Designing","MU"});
        ch.setBounds(180, 350, 200, 20);
        add(ch);
                
                
        l8=new JLabel("Adhar No");
        l8.setBounds(50,400,100,35);
        add(l8);
        
        t7=new JTextField();
        t7.setBounds(180,400,200,35);
        add(t7);
        
        b1=new JButton("Save");
        b1.setBounds(80,450,100,35);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Clear");
        b2.setBounds(200,450,100,35);
        b2.addActionListener(this);
        add(b2);
        
        getContentPane().setBackground(Color.PINK); 
        setBounds(400,100,470,550);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try{
            String std_id=t1.getText();
            String name=t2.getText();
            String father_name=t3.getText();
            String mother_name=t4.getText();
            String email=t5.getText();
            String address=t6.getText();
            String branch=(String)ch.getSelectedItem();
            String adhar=t7.getText();
            
                conn c=new conn();
                String sql="insert into student values('"+std_id+"','"+name+"','"+father_name+"','"+mother_name+"','"+email+"','"+address+"','"+branch+"','"+adhar+"')";
                
                c.s.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Student Added Successfully");
                this.setVisible(false);
                new StudentSection().setVisible(true);
            }
            catch(Exception e){
                System.out.println(e);
            }
          
        }
        else if(ae.getSource()==b2){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
        }
    }
    public static void main(String args[]){
        new NewStudent().setVisible(true);
    }
    
}
