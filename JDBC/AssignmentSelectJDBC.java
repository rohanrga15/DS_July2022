import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AssignmentSelectJDBC 
{
	public static void main(String[] args) 
	{
		System.out.println("Registering driver");
		try 
		{
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Registered");
			System.out.println("Trying to connect");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected to "+conn);
			System.out.println("Trying to make a statement");
			PreparedStatement state = conn.prepareStatement("SELECT * FROM STUDENTSSS WHERE STROLLNO = ?");
			System.out.println("Statement created"+state);
			System.out.println("Trying to execute statement");
			
			System.out.println("Statement executed");
			
			System.out.println("Enter roll no");
			Scanner s1 = new Scanner(System.in);
			int strollno = s1.nextInt();
			
			state.setInt(1, strollno);
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM STUDENTSSS WHERE STROLLNO ="+strollno);
			
			while(rs.next())
			{
				int rollno = rs.getInt(1);
				String stname = rs.getString(2);
				int stbdate = rs.getInt(3);
				int stphy = rs.getInt(4);
				int stchem = rs.getInt(6);
				int stmaths = rs.getInt(7);
				int total = rs.getInt(6);
				int stgrade = rs.getInt(7);
				System.out.println("------------------------");
				System.out.println("Employee number : "+rollno);
				System.out.println("Employee name 	: "+stname);
				System.out.println("Employee salary : "+stbdate);
				System.out.println("Employee number : "+stphy);
				System.out.println("Employee name 	: "+stchem);
				System.out.println("Employee salary : "+stmaths);
				System.out.println("Employee number : "+total);
				System.out.println("Employee name 	: "+stgrade);
				System.out.println("------------------------");
			}
			rs.close();
			state.close();
			conn.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
}

