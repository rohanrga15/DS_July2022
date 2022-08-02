import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AssignmentDeleteDBC 
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
			
			
			System.out.println("Enter roll no");
			Scanner s1 = new Scanner(System.in);
			int strollno = s1.nextInt();
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM STUDENTSSS WHERE STROLLNO = "+strollno);
			
			if(rs.next())
			{
				System.out.println("Trying to make a delete a record");
				PreparedStatement state = conn.prepareStatement("DELETE FROM STUDENTSSS WHERE STROLLNO = ?");
				state.setInt(1, strollno);
				
				int i = state.executeUpdate();
				System.out.println("Executed and deleted "+i+" records");
				
				state.close();
				conn.close();
			}
			else
			{
				EmployeeNotFoundException ee = new EmployeeNotFoundException(" No emp");
				throw ee;
			}
			
//			rs.close();
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
}

