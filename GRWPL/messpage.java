/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grwplinstitutemanagementsystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class messpage  extends JFrame implements ActionListener{
messpage(){
    setUndecorated(true);
setBounds(80,0,1008,1000);
ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("GRWPLInstituteManagementSystem/icons/messpage.jpeg"));
Image i2=i1.getImage().getScaledInstance(1008,1000,Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2);
JLabel l1=new JLabel(i3);
l1.setBounds(0,0,1008,1000);
add(l1);
JLabel l2=new JLabel("GRWPL Hostel Management System");
l2.setForeground(Color.RED);
l2.setFont(new Font("serif",Font.BOLD,55));
l2.setBounds(20,50,900,90);
l1.add(l2);
JButton b1=new JButton("Lets go!!");
b1.setBackground(Color.RED);
b1.setForeground(Color.WHITE);
b1.setBounds(740,550,150,50);
b1.addActionListener(this);
l1.add(b1);
setLayout(null);
setVisible(true);



}
public void actionPerformed(ActionEvent ae){
new messlogin().setVisible(true);
this.setVisible(false);
}
public static void main(String[] args)
{
new messpage();

}

}