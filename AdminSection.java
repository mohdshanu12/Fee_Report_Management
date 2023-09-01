 
package FeeReportManagement;

 import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.border.EmptyBorder;

public class AdminSection extends JFrame implements ActionListener
{
    JLabel l1,l2;
    JButton btn1,btn2,btn3;
    JPanel p1,p2,p3;
    //JTextField tf;
    //JPasswordField pf;
    Font f1,f2;
    //Frame f;
    AdminSection(){
        super(" Admin Login Page");
       setLocation(100,100);
       setSize(500,200);
        l1= new JLabel("Admin Section");
      l1.setHorizontalAlignment(JLabel.CENTER);
       l1.setForeground(Color.BLUE);
       btn1=new JButton("Add Accontant");
       btn2=new JButton("View Accountant");
       btn3=new JButton("Logout Admin");
       btn1.addActionListener(this);
       btn2.addActionListener(this);
       btn3.addActionListener(this);
       //set the font in labels and buttons
       f1=new Font("Arial",Font.BOLD,20);
       f2=new Font("Arial",Font.BOLD,15);
       l1.setFont(f1);
       btn1.setFont(f2);
       btn2.setFont(f2);
       btn3.setFont(f2);
      // f=new JFrame();
       setSize(600,300);
       setResizable(false);
       l2=new JLabel();
       l2.setBounds(0,0,900,600);
       l2.setLayout(null);
       ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("FeeReportManagement/icon/edu1.jpg"));
       Image img=i.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
ImageIcon ii= new ImageIcon(img);
//l2.setIcon(ii);
l2=new JLabel(ii);

// Set Panel for Admin Section Label
p1=new JPanel();
p1.setLayout(new GridLayout(4,1,10,10));
p1.add(l1);
p1.add(btn1);//Add accountant button
p1.add(btn2);//view accountant button
p1.add(btn3);//Logout Admin button

// Set Panel for Buttons
p2=new JPanel();
p2.setLayout(new GridLayout(1,1,10,10));
p2.add(l2);

//p2.setBorder( new EmptyBorder(5,5,5,5));
setLayout( new BorderLayout(10,10));

add(p1,"Center");
add(p2,"East");

//p2.add(btn1);//Add accountant button
//p2.add(btn2);//view accountant button
//p2.add(btn3);//Logout Admin button
// set panel for the image
/*p3=new JPanel();
p3.setLayout(new GridLayout(1,1,10,10));
p3.add(l2);

setLayout( new BorderLayout(0,0));
       add(p1,"North");
       add(p2,"Center");
       add(p3,"West");*/
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn1){
            new AddAccountant().setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource()==btn2)
        {
            new ViewAccountant().setVisible(true);
        }
        if(e.getSource()==btn3){
       this.setVisible(false);
        
        new Index_1().setVisible(true);
        }
        
    }
    public static void main(String[] args) {
        new AdminSection().setVisible(true);
    }
}
