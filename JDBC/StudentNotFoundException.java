
public class StudentNotFoundException extends RuntimeException  {
	public StudentNotFoundException(String str)
	{
		System.out.println("Error "+str);
	}
}
