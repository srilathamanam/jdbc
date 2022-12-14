package jdbcstudentexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentUpdate {

	public static void main(String[] args) {
		Connection con;
		try{  
			//Class.forName("com.mysql.jdbc.Driver");  
			 con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/jdbcexample","root","Ammu@5490");  
			
			// Scanner sc=new Scanner(System.in);
			
			
			
			String s="UPDATE JDBCSTUDENT set stdname='aaa' where stdno=1234";
			
			PreparedStatement stmt= con.prepareStatement(s);
			
			stmt.execute();
			System.out.println("Data modified sucessfully");
			con.close();  
					}
		catch(Exception e){ System.out.println(e);}  
			}  

	}


