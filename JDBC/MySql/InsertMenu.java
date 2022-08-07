package employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMenu 
{
	void insertDatabase(Connection con) throws SQLException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id");
		int id = sc.nextInt();
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from employeeInfo where id = "+id);
		
		if(rs.next())
		{
			EmployeeAlreadyExistsException s = new EmployeeAlreadyExistsException("Employee not in records");
			throw s;
		}
		
		PreparedStatement p = con.prepareStatement("insert into employeeInfo values (?, ?, ?)");
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the employee name");
		String n = sc1.next();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the employee city");
		String c = sc2.next();
		
		p.setInt(1, id);
		p.setString(2, n);
		p.setString(3, c);
		
		int x = p.executeUpdate();
		System.out.println("Records inserted : "+x);
		
		rs.close();
		st.close();
		con.close();
	}
}