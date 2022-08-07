package employee;

public class EmployeeNotFoundException extends RuntimeException
{
	public EmployeeNotFoundException() {
		// TODO Auto-generated constructor stub
		System.out.println("Employee not found");
	}
}
