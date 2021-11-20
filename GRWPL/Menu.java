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
public class Menu extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
    JLabel l2;
    JPanel p;
    Menu(){
        
        
        l2=new JLabel("GRWPL Navigation Bar");
        l2.setForeground(Color.YELLOW);
        l2.setFont(new Font("serif",Font.BOLD,70));
        l2.setBounds(300,0,1600,90);
        add(l2);
        
        
       setUndecorated(true);
        
        
        
        JPanel p1=new JPanel();
        p1.setBounds(0,0,250,1000);
        p1.setLayout(null);
        p1.setBackground(Color.CYAN);
        add(p1);
        
        b1=new JButton("Admission Process");
        b1.setBackground(Color.CYAN);
        b1.setForeground(Color.BLUE);
        b1.setFont(new Font("Tahoma",Font.BOLD,15));
        b1.setMargin(new Insets(0,0,0,80));
        b1.addActionListener(this);
        b1.setBounds(0,0,250,40);
        p1.add(b1);
        
        b2=new JButton("student section");
        b2.setBackground(Color.CYAN);
        b2.setForeground(Color.BLUE);
        b2.setFont(new Font("Tahoma",Font.BOLD,15));
        b2.setMargin(new Insets(0,0,0,50));
        b2.addActionListener(this);
        b2.setBounds(0,40,250,40);
        p1.add(b2);
        
        b3=new JButton("Staff section");
        b3.setBackground(Color.CYAN);
        b3.setForeground(Color.BLUE);
        b3.setFont(new Font("Tahoma",Font.BOLD,15));
        b3.setMargin(new Insets(0,0,0,80));
        b3.addActionListener(this);
        b3.setBounds(0,80,250,40);
        p1.add(b3);
        
        b4=new JButton("GRWPL library Management");
        b4.setBackground(Color.CYAN);
        b4.setForeground(Color.BLUE);
        b4.setFont(new Font("Tahoma",Font.BOLD,12));
        b4.setMargin(new Insets(0,0,0,60));
        b4.addActionListener(this);
        b4.setBounds(0,120,250,40);
        p1.add(b4);
        
        b5=new JButton("GRWPL Hostel Management");
        b5.setBackground(Color.CYAN);
        b5.setForeground(Color.BLUE);
        b5.setFont(new Font("Tahoma",Font.BOLD,12));
        b5.setMargin(new Insets(0,0,0,60));
        b5.addActionListener(this);
        b5.setBounds(0,160,250,40);
        p1.add(b5);
        
        b6=new JButton("GRWPL Canteen Management");
        b6.setBackground(Color.CYAN);
        b6.setForeground(Color.BLUE);
        b6.setFont(new Font("Tahoma",Font.BOLD,12));
        b6.setMargin(new Insets(0,0,0,60));
        b6.addActionListener(this);
        b6.setBounds(0,200,250,40);
        p1.add(b6);
        
        b7=new JButton("GRWPL College Classes");
        b7.setBackground(Color.CYAN);
        b7.setForeground(Color.BLUE);
        b7.setFont(new Font("Tahoma",Font.BOLD,12));
        b7.setMargin(new Insets(0,0,0,60));
        b7.addActionListener(this);
        b7.setBounds(0,240,250,40);
        p1.add(b7);
        
        b8=new JButton("GRWPL Mess");
        b8.setBackground(Color.CYAN);
        b8.setForeground(Color.BLUE);
        b8.setFont(new Font("Tahoma",Font.BOLD,15));
        b8.setMargin(new Insets(0,0,0,80));
        b8.addActionListener(this);
        b8.setBounds(0,280,250,40);
        p1.add(b8);
        
        b9=new JButton("GRWPL Memories");
        b9.setBackground(Color.CYAN);
        b9.setForeground(Color.BLUE);
        b9.setFont(new Font("Tahoma",Font.BOLD,15));
        b9.setMargin(new Insets(0,0,0,70));
        b9.addActionListener(this);
        b9.setBounds(0,320,250,40);
        p1.add(b9);
        
        b10=new JButton("Logout");
        b10.setBackground(Color.CYAN);
        b10.setForeground(Color.BLUE);
        b10.setFont(new Font("Tahoma",Font.BOLD,15));
        b10.setMargin(new Insets(0,0,0,70));
        b10.addActionListener(this);
        b10.setBounds(0,360,250,40);
        p1.add(b10);
        
        b11=new JButton("Exit");
        b11.setBackground(Color.CYAN);
        b11.setForeground(Color.BLUE);
        b11.setFont(new Font("Tahoma",Font.BOLD,15));
        b11.setMargin(new Insets(0,0,0,70));
        b11.addActionListener(this);
        b11.setBounds(0,400,250,40);
        p1.add(b11);
       
        
        b12=new JButton("Guided By");
        b12.setBackground(Color.CYAN);
        b12.setForeground(Color.BLUE);
        b12.setFont(new Font("Tahoma",Font.BOLD,15));
        b12.setMargin(new Insets(0,0,0,80));
        b12.addActionListener(this);
        b12.setBounds(0,440,250,40);
        p1.add(b12);
        
        b13=new JButton("Calculator");
        b13.setBackground(Color.CYAN);
        b13.setForeground(Color.BLUE);
        b13.setFont(new Font("Tahoma",Font.BOLD,15));
        b13.setMargin(new Insets(0,0,0,80));
        b13.addActionListener(this);
        b13.setBounds(0,480,250,40);
        p1.add(b13);
        
        b14=new JButton("Notepad");
        b14.setBackground(Color.CYAN);
        b14.setForeground(Color.BLUE);
        b14.setFont(new Font("Tahoma",Font.BOLD,15));
        b14.addActionListener(this);
        b14.setMargin(new Insets(0,0,0,80));
        b14.setBounds(0,520,250,40);
        p1.add(b14);
        
        b15=new JButton("About");
        b15.setBackground(Color.CYAN);
        b15.setForeground(Color.BLUE);
        b15.setFont(new Font("Tahoma",Font.BOLD,15));
        b15.addActionListener(this);
        b15.setMargin(new Insets(0,0,0,100));
        b15.setBounds(0,560,250,40);
        p1.add(b15);
               
       /* b16=new JButton("Logout");
        b16.setBackground(Color.WHITE);
        b16.setForeground(Color.BLACK);
        b16.setFont(new Font("Tahoma",Font.BOLD,15));
        b16.addActionListener(this);
        b16.setBounds(950,13,100,30);
        p.add(b16);
        
        b17=new JButton("EXIT");
        b17.setBackground(Color.WHITE);
        b17.setForeground(Color.BLACK);
        b17.setFont(new Font("Tahoma",Font.BOLD,15));
        b17.addActionListener(this);
        b17.setBounds(1100,13,100,30);
        p.add(b17);*/
       
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("GRWPLInstituteManagementSystem/icons/gate.jpeg"));
        Image  i2=i1.getImage().getScaledInstance(1080,810,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(200,0,1080,810);
        add(l1);
        
        setBounds(0,0,1300,1000);
        setLayout(null);
        setVisible(true);
    
}
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
             new Admission().setVisible(true); 
        }
        else if(ae.getSource()==b2){
        new StudentSection().setVisible(true);
    }
        else if(ae.getSource()==b3){
             this.setVisible(false);
            new Front_Page().setVisible(true);
        }
        else if(ae.getSource()==b4){
            new LibraryManagemnent().setVisible(true);
        }
        else if(ae.getSource()==b5){
            this.setVisible(false);
            new messpage().setVisible(true);
        }
        else if(ae.getSource()==b6){
            this.setVisible(false);
            new canteen().setVisible(true);
        }
        else if(ae.getSource()==b12){
            new Payment().setVisible(true);
        }
        else if(ae.getSource()==b13){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }
            catch(Exception e){
                
            }
        }
        else if(ae.getSource()==b14){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e){
                
            }
        }
        else if(ae.getSource()==b15){
            new About().setVisible(true);
        }
    }
public static void main(String args[]){
    new Menu().setVisible(true);
}
}
