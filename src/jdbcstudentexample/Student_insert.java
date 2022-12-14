package jdbcstudentexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
//import java.sql.ResultSet;
//import java.sql.Statement;

public class Student_insert {

	public static void main(String[] args) {
		Connection con;
		try {
			// step1: load drivers
			// Class.forName("com.mysql.jdbc.Driver");
			// step 2: establish connection ---> getConnection()
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcexample", "root", "Ammu@5490");
			// 123.125.5.6:3306/database name
			Scanner sc = new Scanner(System.in);
			System.out.println("enter student no, name, fee and gender");
			int i = sc.nextInt();
			
			String name = sc.next();
			
			int fee = sc.nextInt();
			// String ge=sc.next();
			

			Statement stmt = con.createStatement();
			System.out.println("Inserting records into the table...");
			String sql = "insert into JDBCSTUDENT values(11,'xyz',4000)";
			stmt.executeUpdate(sql);
			//stmt.executeUpdate("insert into JDBCSTUDENT values(11,'xyz',4000,'F')");

			String s = "INSERT INTO JDBCSTUDENT VALUES(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setInt(1,i);
			pstmt.setString(2, name);
			pstmt.setInt(3, fee);
			// pstmt.setString(4,ge);
		
			//pstmt.setString(4,'f');
			//pstmt.setObject(4, gen);
			pstmt.executeUpdate();
			System.out.println("Data inserted sucessfully");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
