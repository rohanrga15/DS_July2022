import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ileCreationTest 
{
	public static void main(String[] args) 
	{
		try {
			FileOutputStream file = new FileOutputStream("C:/Users/RGA15/Desktop/file1.txt", true);
			String str = " This is the data ";
			byte b[] = str.getBytes();
			file.write(b);
			file.close();
		} 
		
		catch (FileNotFoundException e) 
		{			
			System.out.println("No file");
		} 
		catch (IOException e) 
		{			
			System.out.println("Input error");
		}
	}
}
