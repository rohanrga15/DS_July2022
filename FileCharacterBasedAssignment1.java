import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileCharacterBasedAssignment1 
{
	public static void main(String[] args) 
	{
		
	}
}

class MyFileRead
{
	FileReader r;
	
	MyFileRead(String s)
	{
		try 
		{
			r = new FileReader("");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found");
		}
	}
	
	void readFile()
	{
		
	}
}