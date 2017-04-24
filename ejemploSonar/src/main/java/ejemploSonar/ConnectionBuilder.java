package ejemploSonar;
 
import java.sql.*;
 
 public class ConnectionBuilder {
     private static String url = "jdbc:mysql://10.4.56.24:3306/AccidentReport?useUnicode=yes&characterEncoding=UTF-8";
    private static String user = "hello";
     private static String pwd = "1234";
    private static String driver = "com.mysql.jdbc.Driver";
    
     public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection con = null;
        con = DriverManager.getConnection(url, user, pwd);
       
        
        
        return con;
    }
 
}