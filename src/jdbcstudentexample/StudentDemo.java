package jdbcstudentexample;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		try{  
			//Class.forName("com.mysql.jdbc.Driver");  
			 con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/jdbcexample","root","Ammu@5490");  
			
			Statement stmt= con.createStatement();  
			ResultSet rs= stmt.executeQuery("select * from JDBCSTUDENT");  
			rs.next();
			
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+" "+rs.getString(4).charAt(0));  
			con.close();  
					}
		catch(Exception e){ System.out.println(e);}  
			}  
			}  
	


