import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AssignmentInsertJDBC 
{
	public static void main(String[] args) throws EmployeeAlreadyExistsException 
	{
		System.out.println("Registering driver");
		try 
		{
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Registered");
			System.out.println("Trying to connect");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected to "+conn);
			System.out.println("Trying to make a prepared statement");
			PreparedStatement state = conn.prepareStatement("INSERT INTO STUDENTSSS VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			System.out.println("Prepared statement created"+state);
			
			System.out.println("Enter roll no");
			Scanner s1 = new Scanner(System.in);
			int rollno = s1.nextInt();
			
			System.out.println("Enter student name");
			Scanner s2 = new Scanner(System.in);
			String stname = s2.next();
			
			System.out.println("Enter birthdate");
			Scanner s3 = new Scanner(System.in);
			int stbdate = s3.nextInt();
			
			System.out.println("Enter phy");
			Scanner s4 = new Scanner(System.in);
			int stphy = s4.nextInt();
			
			System.out.println("Enter chem");
			Scanner s5 = new Scanner(System.in);
			int stchem = s5.nextInt();
			
			System.out.println("Enter maths");
			Scanner s6 = new Scanner(System.in);
			int stmaths = s6.nextInt();
			
//			System.out.println("Enter total");
			Scanner s7 = new Scanner(System.in);
			int sttotal = stphy + stchem + stmaths;
			
			System.out.println("Enter grade");
			Scanner s8 = new Scanner(System.in);
			String stgrade = s8.next();
			
			state.setInt(1, rollno);
			state.setString(2, stname);	// Integers are referring to the question marks declared in the SQL code
			state.setInt(3, stbdate);
			state.setInt(4, stphy);
			state.setInt(5, stchem);
			state.setInt(6, stmaths);	// Integers are referring to the question marks declared in the SQL code
			state.setInt(7, sttotal);
			state.setString(8, stgrade);
			
			
			int i = state.executeUpdate();
			
//			rs.close();
			state.close();
			conn.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
}

