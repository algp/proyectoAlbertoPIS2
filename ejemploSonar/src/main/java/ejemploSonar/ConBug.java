package ejemploSonar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConBug {
	 

	 
	public class User  {
	    private String name;
	    private long studentId;
	    ResultSet rs;
	    public User() {
	    }
	    
	    public User(String name, long studentId) {
	        this.name = name;
	        this.studentId = studentId;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	    public void setStudentId(long studentId) {
	        this.studentId = studentId;
	    }
	 
	    public String getName() {
	        return name;
	    }
	 
	    public long getStudentId() {
	        return studentId;
	    }
	    
	    public void showEvent(){
	        String select = "SELECT AccidentId,TypeId,Location,Detail,Status ";
	        String from = " FROM Accident";
	        try {
	            Connection con = ConnectionBuilder.getConnection();
	 
	            PreparedStatement pstm = con.prepareStatement(select+from+" WHERE UserId = ?;");
	            pstm.setLong(1, getStudentId());
	            ResultSet rec1 = pstm.executeQuery();
	            
	            while((rec1!=null) && (rec1.next())){
	                 System.err.println("AccidentId : "+rec1.getString("AccidentId"));
	                 System.err.println("TypeId : "+rec1.getString("TypeId"));
	                 System.err.println("Location : "+rec1.getString("Location"));
	                 System.err.println("Detail : "+rec1.getString("Detail"));
	                 System.err.println("Status : "+rec1.getString("Status"));
	               
	            }
	            pstm.close();
	            con.close();
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
	         } catch (SQLException ex) {
	            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
	    
	    public void reportEvent(String location,int userId,String Depart,int status,int typeId,String Detail){
	        String insert = "INSERT INTO Accident(Location,UserId,RelatedDepartment,"
	                + "Status,TypeId,Detail)";
	        String insert2 =" VALUES ( '"+location+"',"+userId+",'"+Depart+"',"+status+","+typeId+",'"+Detail+"');";
	      
	        try {
	            Connection con = ConnectionBuilder.getConnection();
	             Statement stm = con.createStatement();
	             stm.executeUpdate(insert+insert2);  
	            stm.close();
	            con.close();
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
	         } catch (SQLException ex) {
	            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        
	    }
	    
	    @Override
	    public String toString() {
	        return "User name : "+name+"\n"+
	                "Student ID : "+studentId+"\n";
	    }
	    
	}
}
