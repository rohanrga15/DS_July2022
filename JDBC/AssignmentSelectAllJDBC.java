import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AssignmentSelectAllJDBC 
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
			Statement state = conn.createStatement();
			System.out.println("Statement created"+state);
			System.out.println("Trying to execute statement");
			ResultSet rs = state.executeQuery("SELECT * FROM STUDENTS");
			System.out.println("Statement executed");
			
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
				System.out.println("Student no : "+rollno);
				System.out.println("Student name 	: "+stname);
				System.out.println("Student birthdate : "+stbdate);
				System.out.println("Student phy : "+stphy);
				System.out.println("Student chem 	: "+stchem);
				System.out.println("Student maths : "+stmaths);
				System.out.println("Student total : "+total);
				System.out.println("Student grade 	: "+stgrade);
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

