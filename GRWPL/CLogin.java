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
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
public class CLogin extends JFrame implements ActionListener{ 
private JPanel panel;
private JTextField textField;
private JPasswordField passwordField; 
private JButton b1,b2;   
CLogin(){  
            setUndecorated(true);
	setBackground(new Color(169, 169, 169));	
        setBounds(330, 150, 600, 400);
		
        panel = new JPanel();
	panel.setBackground(Color.BLUE);
	setContentPane(panel);
	panel.setLayout(null);

	JLabel l1 = new JLabel("Username : ");
	l1.setBounds(124, 89, 95, 24);
	panel.add(l1);

	JLabel l2 = new JLabel("Password : ");
	l2.setBounds(124, 124, 95, 24);
	panel.add(l2);

	textField = new JTextField();
	textField.setBounds(210, 93, 157, 20);
	panel.add(textField);
	
	passwordField = new JPasswordField();
	passwordField.setBounds(210, 128, 157, 20);
	panel.add(passwordField);

	JLabel l3 = new JLabel("");
	l3.setBounds(377, 79, 46, 34);
	panel.add(l3);

	JLabel l4 = new JLabel("");
	l4.setBounds(377, 124, 46, 34);
	panel.add(l3);

	b1 = new JButton("Login");
	b1.addActionListener(this);
                
	b1.setForeground(new Color(46, 139, 87));
	b1.setBackground(new Color(250, 250, 210));
	b1.setBounds(149, 181, 113, 39);
	panel.add(b1);
		
        b2 = new JButton("Reset");
	b2.addActionListener(this);
	
	b2.setForeground(new Color(139, 69, 19));
	b2.setBackground(new Color(255, 235, 205));
	b2.setBounds(289, 181, 113, 39);
	panel.add(b2);



		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.MAGENTA);
		panel2.setBounds(100, 40, 434, 263);
		panel.add(panel2);
	}
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==b1)
            {
                this.setVisible(false);
                new canteenmain().setVisible(true);
            }
            else if(ae.getSource()==b2){
               textField.setText("");
                passwordField.setText("");
            }
        }
public static void main(String args[]){

new CLogin().setVisible(true);

}
}