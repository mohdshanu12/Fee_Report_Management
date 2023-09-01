 
package FeeReportManagement;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
 
public class Index_1 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JButton btn1,btn2;
    JPanel p1,p2,p3;
    Font f1,f2;
   Index_1(){
       super("Home Page");
       setLocation(100,100);
       setSize(500,200);
       l1= new JLabel(" Institute Fee Management System");
       l2= new JLabel("Admin Login");
       l3= new JLabel("Account Login");
       l1.setHorizontalAlignment(JLabel.CENTER);
       l1.setForeground(Color.BLUE);
       btn1=new JButton("Login");
              btn2=new JButton("Login");
              btn1.setBounds(200,100,50,40);
btn1.addActionListener(this);
btn2.addActionListener(this);
// Set the size of the frame 
setSize(600,250);
       setResizable(false);
f1=new Font("Arial",Font.BOLD,20);
f2=new Font("Arial",Font.BOLD,15);
l1.setFont(f1);
l2.setFont(f2);
l3.setFont(f2);
btn1.setFont(f2);
btn2.setFont(f2);
ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("FeeReportManagement/icon/login.png"));
Image img=i.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
ImageIcon ii= new ImageIcon(img);
l4=new JLabel(ii);

// Add the panels in the home page form
p1=new JPanel();
p1.setLayout(new GridLayout(1,1,10,10));
p1.add(l1);

p2=new JPanel();
p2.setLayout(new GridLayout(2,2,10,10));
p2.add(l2);
p2.add(btn1);
p2.add(l3);
p2.add(btn2);
// this code for setting the position of image

p3=new JPanel();
p3.setLayout(new GridLayout(1,1,10,10));
p3.add(l4);
// Border layout of the Home login page
       
setLayout( new BorderLayout(0,0));
       add(p1,"North");
       add(p2,"Center");
       add(p3,"West");

   }
   public void actionPerformed(ActionEvent e){
       if(e.getSource()==btn1){
           new Admin().setVisible(true);
       this.setVisible(false);
       }
       if(e.getSource()==btn2){
           new Accountant().setVisible(true);
       this.setVisible(false);
       }
   }
    public static void main(String[] args) {
        new Index_1().setVisible(true);
    }
}
