 
package FeeReportManagement;

 import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class AccountantSection extends JFrame implements ActionListener{
     JLabel l1,l2;
    JButton btn1,btn2,btn3,btn4,btn5,btn6;
  JPanel p1,p2,p3;
    Font f1,f2;
     AccountantSection(){
         super("Accontant Section");
         setLocation(100,100);
         setSize(500,200);
         l1=new JLabel("Accountant Section");
         l1.setHorizontalAlignment(JLabel.CENTER);
         l1.setForeground(Color.BLUE);
         btn1=new JButton("Add Student");
         btn2=new JButton("view Student");
                  btn3=new JButton("Delete Student");
         btn4=new JButton("Fee deposit table");
         btn5=new JButton("Fee Deposit");
         btn6=new JButton("Back<<-");
         // set the Image in the form
         /*ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("FeeReportManagement/icon/login.png"));
       Image img=i.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
ImageIcon ii= new ImageIcon(img);
l2=new JLabel(ii);*/
        f1=new Font("Arial",Font.BOLD,20); 
        f2=new Font("Arial",Font.BOLD,15);
        // Add the action listener on the button
        btn1.addActionListener(this);
                btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        
        // set the font size of labels and Button
        l1.setFont(f1);
        btn1.setFont(f2);
                btn2.setFont(f2);
        btn3.setFont(f2);
        btn4.setFont(f2);
        btn5.setFont(f2);
        btn6.setFont(f2);

// set the pANEL  on the First label
p1=new JPanel();
p1.setLayout(new GridLayout(1,1,10,10));
p1.add(l1);

// set the size of the form and desiable the maximize button
         setSize(600,500);
         setResizable(false);
/// Set then panel for the buttons
p2=new JPanel();
p2.setLayout(new GridLayout(6,1,10,10));
p2.add(btn1);
p2.add(btn2);
p2.add(btn3);
p2.add(btn4);
p2.add(btn5);
p2.add(btn6);
p3=new JPanel();
p3.setLayout(new GridLayout(1,1,10,10));
//p3.add(l2);
         setLayout(new BorderLayout(8,8));
         add(p1,"North");
         add(p2,"Center");
         //add(p3,"West");
        }
 
     
     public void actionPerformed(ActionEvent e){
         if(e.getSource()==btn1){
         new Student().setVisible(true);
         }
         if(e.getSource()==btn2){
         new View().setVisible(true);
         }
         if(e.getSource()==btn3){
         new Delete_Student_Details().setVisible(true);
         }
         if(e.getSource()==btn4){
         new DuesFees().setVisible(true);
         }
         if(e.getSource()==btn5){
        new Fees_Deposit().setVisible(true);
  
         }
         if(e.getSource()==btn6){
             
new Index_1().setVisible(true);
this.setVisible(false);         }
         
     }
     public static void main(String[] args) {
        new AccountantSection().setVisible(true);
    }
}
