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
public class FirstYear extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,label1;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
    JTextArea ta1,ta2;
    JCheckBox c1,c2,c3,c4;
    JRadioButton r1,r2;
    Choice ch,ch2;
    JButton b1,b2,b3;
    FirstYear(){
        
       label1=new JLabel("First Year Admission");
       label1.setBounds(850,50,1000,30);
       label1.setFont(new Font("Italian",Font.BOLD,40));
       label1.setForeground(Color.magenta);
       add(label1);
       
       setUndecorated(true);
        
       l1=new JLabel("Student Name:");
       l1.setBounds(20,50,100,35);
       add(l1);
       
       t1=new JTextField();
       t1.setBounds(170,50,200,35);
       add(t1);
       
       l2=new JLabel("Father Name:");
       l2.setBounds(20,100,100,35);
       add(l2);
       
       t2=new JTextField();
       t2.setBounds(170,100,200,35);
       add(t2);
       
       l3=new JLabel("Mother Name:");
       l3.setBounds(20,150,100,35);
       add(l3);
       
       t3=new JTextField();
       t3.setBounds(170,150,200,35);
       add(t3);
       
       l4=new JLabel("Email-ID:");
       l4.setBounds(20,200,100,35);
       add(l4);
       
       t4=new JTextField();
       t4.setBounds(170,200,200,35);
       add(t4);
       
       l5=new JLabel("Mobile No:");
       l5.setBounds(20,250,100,35);
       add(l5);
       
       t5=new JTextField();
       t5.setBounds(170,250,200,35);
       add(t5);
        
       l6=new JLabel("Gender:");
       l6.setBounds(20,300,100,35);
       add(l6);
       
       r1=new JRadioButton("Male");
       r1.setBounds(170,300,80,35);
       add(r1);
       
       r2=new JRadioButton("Female");
       r2.setBounds(260,300,80,35);
       add(r2);
    
       l8=new JLabel("Local Address:");
       l8.setBounds(20,350,100,35);
       add(l8);
       
       ta1=new JTextArea();
       ta1.setBounds(170,350,200,80);
       ta1.setBackground(Color.YELLOW);
       add(ta1);
       
       l9=new JLabel("Permananent Address:");
       l9.setBounds(20,450,150,35);
       add(l9);
       
       ta2=new JTextArea();
       ta2.setBounds(170,450,200,80);
       ta2.setBackground(Color.YELLOW);
       add(ta2);
       
       l10=new JLabel("whether AdharLink Done?:");
       l10.setBounds(400,50,150,35);
       add(l10);
       
       c3=new JCheckBox("yes");
       c3.setBounds(570,50,100,35);
       add(c3);
       
       c4=new JCheckBox("No");
       c4.setBounds(670,50,100,35);
       add(c4);
       
       l7=new JLabel("Adhar No:");
       l7.setBounds(400,100,100,35);
       add(l7);
       
       t7=new JTextField();
       t7.setBounds(570,100,200,35);
       add(t7);
       
       l12=new JLabel("Branch Name:");
       l12.setBounds(400,150,100,35);
       add(l12);
       
       t8=new JTextField();
       t8.setBounds(570,150,200,35);
       add(t8);
       
       l13=new JLabel("IFSC Code:");
       l13.setBounds(400,200,100,35);
       add(l13);
       
       t9=new JTextField();
       t9.setBounds(570,200,200,35);
       add(t9);
       
       l14=new JLabel("Cast:");
       l14.setBounds(400,250,100,35);
       add(l14);
       
       t10=new JTextField();
       t10.setBounds(570,250,200,35);
       add(t10);
       
       l11=new JLabel("Whether Any Scholarship?:");
       l11.setBounds(400,300,170,35);
       add(l11);
       
       c1=new JCheckBox("yes");
       c1.setBounds(570,300,100,35);
       add(c1);
       
       c2=new JCheckBox("No");
       c2.setBounds(670,300,100,35);
       add(c2);
       
       l15=new JLabel("Previus Education");
       l15.setBounds(400,350,150,35);
       add(l15);
       
       
       ch=new Choice();
       ch.add("1st Year");
       ch.add("ITI");
       ch.add("12th");
       ch.setBounds(570,350,200,85);
       add(ch);
       
       l16=new JLabel("Percentage");
       l16.setBounds(400,400,150,35);
       add(l16);
       
       t11=new JTextField();
       t11.setBounds(570,400,200,35);
       add(t11);
       
       l17=new JLabel("Fees");
       l17.setBounds(400,450,150,35);
       add(l17);
       
       t12=new JTextField();
       t12.setBounds(570,450,200,35);
       add(t12);
       
       b1=new JButton("Submit");
       b1.setBounds(100,570,170,35);
       b1.addActionListener(this);
       add(b1);
       
       b2=new JButton("Clear");
       b2.setBounds(280,570,170,35);
       b1.addActionListener(this);
       add(b2);
       
       b3=new JButton("Back");
       b3.setBounds(460,570,170,35);
       b3.addActionListener(this);
       add(b3);
       
       l18=new JLabel("Course");
       l18.setBounds(400,500,150,35);
       add(l18);
       
       ch=new Choice();
       ch.add("Computer");
       ch.add("Electronic");
       ch.add("Dress Designing");
       ch.add("Civil");
       ch.add("Medical Electronic");
       ch.setBounds(570,500,200,65);
       add(ch);
       
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("GRWPLInstituteManagementSystem/icons/fy.jpeg"));
       Image i2=i1.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel l1=new JLabel(i3);
       l1.setBounds(780,100,500,500);
       add(l1);
        
       
       
        getContentPane().setBackground(Color.LIGHT_GRAY); 
        setBounds(000,000,1300,1000);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1)
        {
            try{
            JOptionPane.showMessageDialog(null,"First Year student Successfully Registered!!");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            t10.setText("");
            t11.setText("");
            t12.setText("");
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
            t7.setText("");
            t8.setText("");
            t9.setText("");
            t10.setText("");
            t11.setText("");
            t12.setText("");
        }
        else
        {
            this.setVisible(false);
            new Admission().setVisible(true);
        }
    }
    public static void main(String args[])
    {
                new FirstYear().setVisible(true);

    }
    
}
