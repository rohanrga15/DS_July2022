import java.time.LocalDate;

public class OverrideTest 
{
	public static void main(String[] args) 
	{
		Employee obj1 = new Employee(6813, "Joe", 5000, LocalDate.of(2022, 1, 20));
		System.out.println("The details are "+obj1);
	}
}

class Employee
{
	private int empNumber;
	private String empName;
	private double salary;
	private LocalDate joiningDate;
	
	public Employee(int empNumber, String empName, double salary, LocalDate joiningDate) 
	{
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", empName=" + empName + ", salary=" + salary + ", joiningDate="
				+ joiningDate + "]";
	}
	
	

	
}