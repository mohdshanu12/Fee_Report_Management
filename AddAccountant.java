 
package FeeReportManagement;

 import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
public class AddAccountant extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7;
        JButton btn1,btn2;
        JTextField t1,t2,t3,t4;
        JPasswordField pf;
        JPanel p1,p2,p3;
        Font f1,f2;
        
    AddAccountant(){
        super("Accontant Section");
         setLocation(100,100);
       setSize(500,200);
       l1=new JLabel("Add Accountant");
       l1.setHorizontalAlignment(JLabel.CENTER);
       l1.setForeground(Color.BLUE);
              l2=new JLabel("Name");
       l3=new JLabel("Password");
       l4=new JLabel("Email");
      l5=new JLabel("Contact");
       l6=new JLabel("Address");

       
        t1=new JTextField();
                t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
pf=new JPasswordField();
btn1=new JButton("Add Accountant");
btn2=new JButton("Back");

// set the size of the form
setSize(600,400);
        setResizable(false);
        
// Add the Action Listener onthe buttons
btn1.addActionListener(this);
btn2.addActionListener(this);
// Add the images 
/*ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("FeeReportManagement/icon/login.png"));
       Image img=i.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
ImageIcon ii= new ImageIcon(img);
l7=new JLabel(ii);*/ 
// add the font 
f1=new Font("Arial",Font.BOLD,20);
       f2=new Font("Arial",Font.BOLD,15);
l1.setFont(f1);
l2.setFont(f2);
l3.setFont(f2);
l4.setFont(f2);
l5.setFont(f2);
l6.setFont(f2);
btn1.setFont(f2);
btn2.setFont(f2);
t1.setFont(f2);
t2.setFont(f2);
t3.setFont(f2);
t4.setFont(f2);
pf.setFont(f2);
// Add the panel  For Accountant Section
   p1=new JPanel();
p1.setLayout(new GridLayout(1,1,10,10));  
p1.add(l1);
// Add panel  for the tabels and text fields and buttons
p2=new JPanel();
p2.setLayout(new GridLayout(6,2,10,10));
p2.add(l2);
p2.add(t1);
p2.add(l3);
p2.add(pf);
p2.add(l4);
p2.add(t2);
p2.add(l5);
p2.add(t3);
p2.add(l6);
p2.add(t4);
p2.add(btn1);
p2.add(btn2);

// Add panel for the IMage 
//p3=new JPanel();
//p3.setLayout(new GridLayout(1,1,10,10));
//p3.add(l7);

// For adding the all things  we set the border in the frame

setLayout( new BorderLayout(10,10));

add(p1,"North");
add(p2,"Center");
//add(p3,"East");
    }
    public void actionPerformed(ActionEvent e){
        // Write the condition for the add Accontant button
       
        
        if(e.getSource()==btn1){
        String Name=t1.getText();
        String Password =pf.getText();
        String Email=t2.getText();
        String Mobile=t3.getText();
        String Add=t4.getText();
        // checking the textField is empty or not 
        if(!Name.isEmpty() && Email !=null && !Password.isEmpty()&& !Mobile.isEmpty()&& !Add.isEmpty()){
             
        try{
        ConnectionClass obj=new ConnectionClass();
        String sql="insert into Add_Accountant(name,password,email,contact,address)values('"+Name+"','"+Password+"','"+Email+"','"+Mobile+"','"+Add+"')";
       int a=obj.stmt.executeUpdate(sql);
       if(a==1){
       JOptionPane.showMessageDialog(this,"Your data is successfully inserted");
       this.setVisible(false);
       }else{
              JOptionPane.showMessageDialog(this,"Your data is not successfully inserted");
this.setVisible(true);
       }
       
        }
        catch(Exception ee){
            System.out.println(ee+"Data is not added in Database");}
        
            System.out.println("The name is entered " + Name);
        }
        else{             System.out.println("Any fields are empty");
}
        /*String Password =pf.getText();
        String Email=t2.getText();
        String Mobile=t3.getText();
        String Add=t4.getText();
        try{
        ConnectionClass obj=new ConnectionClass();
        String sql="insert into Add_Accountant(name,password,email,contact,address)values('"+Name+"','"+Password+"','"+Email+"','"+Mobile+"','"+Add+"')";
       int a=obj.stmt.executeUpdate(sql);
       if(a==1){
       JOptionPane.showMessageDialog(this,"Your data is successfully inserted");
       this.setVisible(false);
       }else{
              JOptionPane.showMessageDialog(this,"Your data is not successfully inserted");
this.setVisible(true);
       }
       
        }
        catch(Exception ee){
            System.out.println(ee+"Data is not added in Database");}*/
        }
    
    // write the condition for the back button
if(e.getSource()==btn2){
new AdminSection().setVisible(true);
this.setVisible(false);
}}
    public static void main(String[] args) {
        new AddAccountant().setVisible(true);
    }
    
}
