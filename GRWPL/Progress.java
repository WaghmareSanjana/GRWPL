
package grwplinstitutemanagementsystem;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class Progress extends JFrame implements Runnable {
    JProgressBar p;
    Thread t;
  Progress(){
      t=new Thread((Runnable)this);
      
              
        JLabel l1=new JLabel("GRWPL INSTITUTE");
        l1.setBounds(50,20,400,40);
        l1.setFont(new Font("RALEWAY",Font.BOLD,35));
        l1.setForeground(Color.BLUE);
        add(l1);
      
        p =new JProgressBar();
        p.setBounds(10,80,450,40);
        p.setStringPainted(true);
        add(p);
        
        JLabel l2=new JLabel("Please Wait...");
        l2.setFont(new Font("Tahoma",Font.BOLD,15));
        l2.setForeground(Color.RED);
        l2.setBounds(300,120,120,25);
        add(l2);
        
        Panel p2=new Panel();
        p2.setBounds(80,200,300,300);
        p2.setBackground(Color.WHITE);
        add(p2);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("GRWPLInstituteManagementSystem/icons/load.jfif"));
        Image i5=i4.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l4=new JLabel(i6);
        p2.add(l4);
        
       setBounds(400,100,500,550);
       getContentPane().setBackground(Color.WHITE);
       l4.setBorder(new EmptyBorder(5, 5, 5, 5));
       setLayout(null);
       setUpLoading();
       setUndecorated(true);
  }   
 
    

public void run(){
try{
            for(int i=1;i<=101;i++){
                int m=p.getMaximum();
                int n=p.getValue();
                if(n<m){
                    p.setValue(p.getValue()+1);
                }
                else{
                    i=101;
                    setVisible(false);
                   new Menu().setVisible(true);
                }
                Thread.sleep(50);
  
                
            }
              }catch(Exception e){
            e.printStackTrace();
        }
    }
            public void setUpLoading(){
                setVisible(false);
                 t.start();

}

public static void main(String args[]){
new Progress().setVisible(true);
}
}