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

public class canteen extends JFrame implements ActionListener{
    JButton b1;
   
   canteen(){
       
       super("GRWPL Canteen");
       
        
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("GRWPLInstituteManagementSystem/icons/canteen.jpg"));
        Image i1 = c1.getImage().getScaledInstance(700, 700,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);     
        JLabel l1 = new JLabel(i2);
        add(l1);
        
        JLabel l2=new JLabel("GRWPL Canteen");
       l2.setBounds(100,0,1000,350);
       l2.setForeground(Color.RED);
       l2.setFont(new Font("Tahoma",Font.BOLD,50));
       l1.add(l2);
      
        
        b1=new JButton("lets go!!");
        b1.setBounds(500,600,100,35);
        b1.addActionListener(this);
        l1.add(b1);
        
        
        setBounds(200,20,700,700);
         setUndecorated(true);
       
    }
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==b1){
           this.setVisible(false);
           new canteenmain().setVisible(true);
       }
   }
    public static void main(String[] args){
        canteen f1 = new canteen();
        f1.setVisible(true);
        
    }
}
  
