/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grwplinstitutemanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LibraryManagemnent extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public LibraryManagemnent() {
		
                setSize(710,530);
                setLayout(null);
                setLocation(300,100);
                setUndecorated(true);
                
                

		l1 = new JLabel("");
                b1 = new JButton("Lets go!!");
                
                b1.setBackground(Color.RED);
                b1.setForeground(Color.WHITE);
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("GRWPLInstituteManagementSystem/icons/l4.jpeg"));
                Image i3 = i1.getImage().getScaledInstance(710, 536,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                JLabel l2=new JLabel("WELCOME TO GRWPL Library");
                l2.setBounds(100,0,1000,300);
                l2.setFont(new Font("Tahoma",Font.BOLD,30));
                l2.setForeground(Color.RED);
                l1.add(l2);
                
                b1.setBounds(540,410,150,40);
		l1.setBounds(0,0, 710, 536);
                
                l1.add(b1);
		add(l1);
                
                b1.addActionListener(this);
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login_User().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                LibraryManagemnent window = new LibraryManagemnent();
                window.setVisible(true);			
	}
}