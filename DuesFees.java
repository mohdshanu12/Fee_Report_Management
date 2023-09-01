 
package FeeReportManagement;

 import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
public class DuesFees extends JFrame {
    String a[]={"roll_no","name","email","course","fee","paid","dues","address","city","state","contact_no"};
        String b[][]=new String[20][11];
        int i=0,j=0;
        JTable t;
        Font f1,f2;
        DuesFees(){
        super("Due Fees Student Details");
        setSize(1300,400);
        setLocation(1,1);
        f1=new Font("Arial",Font.BOLD,15);
        try{
    ConnectionClass obj=new ConnectionClass();
    String sql="select roll_no,name,email,course,fee,paid,fee-paid as Dues ,address,city,state,contactno  from Add_Student";
    ResultSet rs=obj.stmt.executeQuery(sql);
    while(rs.next())
    {
        b[i][j++]=rs.getString("roll_no");
        b[i][j++]=rs.getString("name");
        b[i][j++]=rs.getString("email");
        b[i][j++]=rs.getString("course");
        b[i][j++]=rs.getString("fee");
        b[i][j++]=rs.getString("paid");
        b[i][j++]=rs.getString("dues");
        b[i][j++]=rs.getString("address");
        b[i][j++]=rs.getString("city");
        b[i][j++]=rs.getString("state");
        b[i][j++]=rs.getString("contactno");
        i++;
        j=0;
        
    }
   t=new JTable(b,a);
      setFont(f1);}
        catch(Exception ee){
            System.out.println(ee+"error");}
    JScrollPane sp=new JScrollPane(t);
    add(sp);}
    public static void main(String[] args) {
        new DuesFees().setVisible(true);
    }
        }

