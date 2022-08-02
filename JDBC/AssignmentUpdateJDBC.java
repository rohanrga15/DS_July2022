import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AssignmentUpdateJDBC 
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
			PreparedStatement state = conn.prepareStatement("UPDATE STUDENTSSS SET STNAME = ? , STBDATE = ?, STPHY = ?, STCHEM = ? , STMATHS = ?, STTOTAL = ?, STGRADE = ? WHERE STROLLNO = ?");
			System.out.println("Prepared statement created"+state);
			
			System.out.println("Enter roll no");
			Scanner s1 = new Scanner(System.in);
			int rollno = s1.nextInt();
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM STUDENTSSS WHERE STROLLNO = "+rollno);
			
			if(rs.next())
			{
				
			}
			else
			{
				EmployeeNotFoundException ee = new EmployeeNotFoundException("No emp");
				throw ee;
			}
			
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
			
			state.setInt(8, rollno);
			state.setString(1, stname);	// Integers are referring to the question marks declared in the SQL code
			state.setInt(2, stbdate);
			state.setInt(3, stphy);
			state.setInt(4, stchem);
			state.setInt(5, stmaths);	// Integers are referring to the question marks declared in the SQL code
			state.setInt(6, sttotal);
			state.setString(7, stgrade);
			
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

