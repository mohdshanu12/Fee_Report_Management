
package FeeReportManagement;
 import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;



public class View extends JFrame  
{
    
        String a[]={"name","fathers_name","aadharNo","course","semester","catagory","email","contact","address","dob"};
        String b[][]=new String[20][10];
        int i=0,j=0;
        JTable t;
        Font f1;
View()
{
    super("View Student Details");
        setSize(800,400);
        setLocation(1,1);
        f1=new Font("Arial",Font.BOLD,15);
try{
    ConnectionClass obj=new ConnectionClass();
    String sql="select * from student_info";
    ResultSet rs=obj.stmt.executeQuery(sql);
    while(rs.next())
    {
        b[i][j++]=rs.getString("name");
        b[i][j++]=rs.getString("fathers_name");
                b[i][j++]=rs.getString("aadharNo");

        b[i][j++]=rs.getString("course");
                b[i][j++]=rs.getString("semester");

                b[i][j++]=rs.getString("catagory");

        b[i][j++]=rs.getString("email");
        b[i][j++]=rs.getString("contact");
        b[i][j++]=rs.getString("address");
        b[i][j++]=rs.getString("dob");
        //b[i][j++]=rs.getString("state");
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
        new View().setVisible(true);
}
}

