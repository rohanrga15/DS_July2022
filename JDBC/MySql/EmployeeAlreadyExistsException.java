package employee;

public class EmployeeAlreadyExistsException extends RuntimeException{

	public EmployeeAlreadyExistsException(String str) {
		System.out.println("Error : "+str);
	}
}
