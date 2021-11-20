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
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.scene.control.PasswordField;
public class login extends JFrame implements ActionListener {
    TextField t1;
    JPasswordField t2;
    Button b1,b2;
    JCheckBox c1;
    Label l1,l2,l5,l4;
    public login(){
        
        l1=new Label("Username:");
        l1.setBounds(730,250,65,25);
        add(l1);
        
        t1=new TextField();
        t1.setBounds(650,280,260,35);
        add(t1);
        
        l1=new Label("Password:");
        l1.setBounds(730,350,65,25);
        add(l1);
        
       
        t2=new JPasswordField();
        t2.setBounds(650, 380, 260, 35);
        add(t2);
       
        
        b1=new Button("login");
        b1.setBounds(650,480,100,35);
        b1.addActionListener(this);
        add(b1);
        
        b2=new Button("Reset");
        b2.setBounds(780,480,100,35);
        b2.addActionListener(this);
        add(b2);
        
        Panel p1=new Panel();
        p1.setBounds(0,0,1300,800);
        p1.setBackground(Color.BLUE);
        add(p1);
           
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("GRWPLInstituteManagementSystem/icons/loginbg.png"));
        Image i2=i1.getImage().getScaledInstance(1300,800,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        p1.add(l3);
       
        
        l5=new Label("GRWPL INSTITUTE WELCOME YOU!!");
        l5.setBounds(10,30,1300,70);
        l5.setBackground(Color.BLACK);
        l5.setForeground(Color.PINK);
        l5.setFont(new Font("Tahoma",Font.BOLD,70));
        l3.add(l5);
        
        Panel p3=new Panel();
        p3.setBounds(400,510,200,35);
        p3.setBackground(Color.PINK);
        l3.add(p3);
        
        l4=new Label("*GRWPL*");
        l4.setBounds(410,510,100,20);
        l4.setBackground(Color.PINK);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Tahoma",Font.BOLD,20));
        p3.add(l4);
        
        setUndecorated(true);
        
        setBounds(0,0,1300,1000);
        setLayout(null);
        setVisible(true);
        
    /*   while(true){
       l5.setVisible(false);
       try{
       Thread.sleep(600);
       }catch(Exception e){}
       l5.setVisible(true);
       try{

       Thread.sleep(600);
       }catch(Exception e){}
}*/
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String username=t1.getText();
            String password=t2.getText();
            try{
                conn con=new conn();
                String sql="select *from login where username=? and password=?";
                PreparedStatement pst=con.c.prepareStatement(sql);
                 pst.setString(1, t1.getText());
                    pst.setString(2, t2.getText());

                    ResultSet rs = pst.executeQuery();
                    if (rs.next()) {
                       
                        new Progress().setVisible(true);
                    } else
			JOptionPane.showMessageDialog(null, "Invalid Login or Password!");
                       
		} catch (Exception e2) {
                    e2.printStackTrace();
		}
            }
        else if(ae.getSource()==b2){
            t1.setText("");
            t2.setText("");
   
        }
       
       
        }
    
        
    
    public static void main(String args[]){
        new login().setVisible(true);
        
    }
    
}
