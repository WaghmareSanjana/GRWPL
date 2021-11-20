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
public class Admission extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem i1,i2,i3,i4,i5;
    Admission(){
       mb=new JMenuBar();
       mb.setBounds(0,0,1300,30);
       mb.setBackground(Color.YELLOW);
       add(mb);
       
       setUndecorated(true);
       
       m1=new JMenu("Admission");
       m1.setForeground(Color.RED);
       mb.add(m1);
       
       m2=new JMenu("Option");
       m2.setForeground(Color.RED);
       mb.add(m2);
       
       i4=new JMenuItem("LogOut");
       i4.addActionListener(this);
       m2.add(i4);
       
       i5=new JMenuItem("Exit");
       i5.addActionListener(this);
       m2.add(i5);
       
       i1=new JMenuItem("First Year");
       i1.addActionListener(this);
       m1.add(i1);

       i2=new JMenuItem("Second Year");
       i2.addActionListener(this);
       m1.add(i2);

       i3=new JMenuItem("Third Year");
       i3.addActionListener(this);
       m1.add(i3);
       
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("GRWPLInstituteManagementSystem/icons/home.jpeg"));
       Image i2=i1.getImage().getScaledInstance(1300,800,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel l1=new JLabel(i3);
       l1.setBounds(0,0,1300,700);
       add(l1);

      /* i4=new JMenuItem("ADD DRIVERS");
       i4.addActionListener(this);
       m2.add(i4);*/
       
        setBounds(0,0,1800,1020);
        setLayout(null);
        setVisible(true);
        
        
       
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==i1){
        new FirstYear().setVisible(true);
    }else if(ae.getSource()==i2){
        new SecondYear().setVisible(true);
    }
    else if(ae.getSource()==i3){
        new ThirdYear().setVisible(true);
    }
    else if(ae.getSource()==i4){
        new login().setVisible(true);
    }
        else if(ae.getSource()==i5){
        new Menu().setVisible(true);
    }
    }

    public static void main(String args[]){
        new Admission().setVisible(true);
    }
}
