 
package FeeReportManagement;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
 
public class Accountant extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JButton btn1,btn2;
    JTextField tf;
    JPasswordField pf;
    JPanel p1,p2;
    Font f1,f2;
    Accountant(){
        super("Accountant Page");
        setLocation(100,100);
        setSize(500, 200);
        l1=new JLabel("Accountant Login");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.BLUE);
        l2=new JLabel("Name");
        l3=new JLabel("password");
        tf=new JTextField();
        pf=new JPasswordField();
        btn1=new JButton("Login");
        btn2=new JButton("Cancle");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        f1=new Font("Arial",Font.BOLD,20);
        f2=new Font("Arial",Font.BOLD,15);
        l1.setFont(f1);
        l2.setFont( f2);
        l3.setFont( f2);
        btn1.setFont(f2);
        btn2.setFont(f2);
        tf.setFont(f2);
        pf.setFont(f2);
        //Add the panels
        p1=new JPanel();
p1.setLayout(new GridLayout(1,1,10,10));  
p1.add(l1);

p2=new JPanel();
p2.setLayout(new GridLayout(3,2,10,10));  
p2.add(l2);
p2.add(tf);
p2.add(l3);
p2.add(pf);
p2.add(btn1);
p2.add(btn2);
        setLayout(new BorderLayout(0,0));
        add(p1,"North");
        add(p2,"Center");
    }
    
    public void actionPerformed(ActionEvent e){
        String name=tf.getText();
        String pass=pf.getText();
        if(e.getSource()==btn1){
        try{
            ConnectionClass obj=new ConnectionClass();
            String sql="select * from Add_Accountant where name='"+name+"' and password='"+pass+"'";
           ResultSet rs= obj.stmt.executeQuery(sql);
           if(rs.next()){
           new AccountantSection().setVisible(true);
           this.setVisible(false);}
           else{
               JOptionPane.showMessageDialog(this,"Your Id and Password Are Wrong");
           }
        }
        catch(Exception ee){
            System.out.println(ee+  "Error Found");}
        }
        if(e.getSource()==btn2){
        this.setVisible(false);}
    }
    public static void main(String[] args) {
        new Accountant().setVisible(true);
    }
    
}
