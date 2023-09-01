 
package FeeReportManagement;

 import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
public class ViewAccountant extends JFrame {
    String a[]={"name","password","email","contact","address"};
    String b[][]=new String[20][5];
    int i=0,j=0;
    JTable t;
    Font f1;
    ViewAccountant(){
    super("View Accontant Details");
        setSize(800,400);
        setLocation(1,1);
        f1=new Font("Arial",Font.BOLD,15);
        try{
        
        ConnectionClass obj=new ConnectionClass();
        String sql="select * from Add_Accountant";
        ResultSet rs=obj.stmt.executeQuery(sql);
        while(rs.next())
        {
            b[i][j++]=rs.getString("name");
                        b[i][j++]=rs.getString("password");
            b[i][j++]=rs.getString("email");
            b[i][j++]=rs.getString("contact");
            b[i][j++]=rs.getString("address");
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
        new ViewAccountant().setVisible(true);
    }
    }

