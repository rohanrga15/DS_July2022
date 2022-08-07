package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JDBCCommands 
{
	public static void main(String[] args) throws SQLException, InterruptedException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1 : Update");
		System.out.println("2 : Select all");
		System.out.println("3 : Select");
		System.out.println("4 : Delete");
		System.out.println("5 : Insert");
		
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		
		Connection c = DriverManager.getConnection("jdbc:mysql:///employee", "root", "shashi@1996");
		
		switch (ch) {
		case 1:
			UpdateMenu u = new UpdateMenu();
			u.updateDatabase(c);
			break;
			
		case 2:
			SelectAllMenu s = new SelectAllMenu();
			s.selectAllDatabase(c);
			break;
			
		case 3:
			SelectMenu s1 = new SelectMenu();
			s1.selectDatabase(c);
			break;
			
		case 4:
			DeleteMenu d = new DeleteMenu();
			d.deleteDatabase(c);
			break;
			
		case 5:
			InsertMenu i = new InsertMenu();
			i.insertDatabase(c);
			break;
			
		default:
			InputMismatchException i1 = new InputMismatchException("Wrong input");
			throw i1;
		}
		
		
	}
}
