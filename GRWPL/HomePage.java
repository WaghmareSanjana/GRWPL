
package grwplinstitutemanagementsystem;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class HomePage extends JFrame implements Runnable,ActionListener{
    JLabel l2;
    JButton b1;
    HomePage()
    {
        ImageIcon  i1=new ImageIcon(ClassLoader.getSystemResource("GRWPLInstituteManagementSystem/icons/home.jpeg"));
        Image i2=i1.getImage().getScaledInstance(1300, 800, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        add(l1);  
        
        l2=new JLabel("GRWPL Institute Administration System");
        l2.setForeground(Color.YELLOW);
        l2.setFont(new Font("serif",Font.BOLD,70));
        l2.setBounds(5,10,1600,90);
        l1.add(l2);
        setUndecorated(true);
        
        b1=new JButton("Lets go!!");
        b1.setBounds(1100,600,100,35);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Tahoma",Font.BOLD,15));
        b1.addActionListener(this);
        l1.add(b1);
        
        setBounds(0,0,1300,800);
         
        
}
    public void run(){
        
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
          new login().setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new HomePage().setVisible(true);
   
        }
    }
    

