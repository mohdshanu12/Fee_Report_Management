 
package FeeReportManagement;
import java.sql.*;
public class ConnectionClass {
    Connection con;
    Statement stmt;
    ConnectionClass() {
        try{Class.forName("oracle.jdbc.driver.OracleDriver");
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
        stmt=con.createStatement();
        if(con.isClosed()){
                System.out.println("Not connect");}
        else{
            System.out.println("Connect");}
        }
        catch(Exception e){
        System.out.println(e);}
}
    
}
