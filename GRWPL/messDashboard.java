/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grwplinstitutemanagementsystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class messDashboard extends JFrame implements ActionListener{
JMenuBar mb;
JMenu m1,m2;
JMenuItem i1,i2,i3,i4,i5;
messDashboard(){
    setUndecorated(true);
mb=new JMenuBar();
add(mb);
m1=new JMenu("HOSTEL MANAGEMENT");
m1.setForeground(Color.RED);
mb.add(m1);

m2=new JMenu("ADMIN");
m2.setForeground(Color.BLUE);
mb.add(m2);

i1=new JMenuItem("RECEPTION");
i1.addActionListener(this);
m1.add(i1);

i5=new JMenuItem("LOGOUT");
i5.addActionListener(this);
m1.add(i5);

i2=new JMenuItem("ADD EMPLOYEE");
i2.addActionListener(this);
m2.add(i2);

i3=new JMenuItem("ADD ROOM");
i3.addActionListener(this);
m2.add(i3);

i4=new JMenuItem("ADD STUDENT");
i4.addActionListener(this);
m2.add(i4);

mb.setBounds(0,0,1200,30);
ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("GRWPLInstituteManagementSystem/icons/messDashboard.jpeg"));
Image i2=i1.getImage().getScaledInstance(1366,650,Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2);
JLabel l1=new JLabel(i3);
l1.setBounds(0,0,1366,700);
add(l1);
JLabel l2=new JLabel("THE GULMOHAR GROUP WELCOMES YOU");
l2.setBounds(0,0,1500,200);
l2.setForeground(Color.RED);
l2.setFont(new Font("Tahoma",Font.PLAIN,60));
l1.add(l2);

setLayout(null);
setBounds(0,0,1800,1020);
setVisible(true);


}
public void actionPerformed(ActionEvent ae){
    if(ae.getActionCommand().equals("RECEPTION")){
      new messReception().setVisible(true); 
    }
    else if(ae.getActionCommand().equals("LOGOUT")){
      new Menu().setVisible(true); 
    }else if(ae.getActionCommand().equals("ADD EMPLOYEE")){
        new AddEmployee().setVisible(true);
    }else if(ae.getActionCommand().equals("ADD ROOM")){
        new AddRoom().setVisible(true);
    }else if(ae.getActionCommand().equals("ADD STUDENT")){
      new AddStudents().setVisible(true);
    }
}
public static void main(String[] args)
{
new messDashboard().setVisible(true);
}

}
