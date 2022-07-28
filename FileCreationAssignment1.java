import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCreationAssignment1 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file location");
		String s1 = sc.nextLine();
		
		MyFileCreator f1 = new MyFileCreator(s1);
		
		System.out.println("Enter the data");
		String s2 = sc.nextLine();
		f1.writeFile(s2);
		f1.closeFile();
	}
}

class MyFileCreator 
{
	FileOutputStream file;
	
	MyFileCreator(String str)
	{
		try 
		{
			file = new FileOutputStream(str);
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("No file found");
		}
		
	}
	
	void writeFile(String s)
	{
		
		byte bb[] = s.getBytes();
		try 
		{
			file.write(bb);
		} 
		catch (IOException e) 
		{
			System.out.println("Input error");
		}
	}
	
	void closeFile() throws IOException
	{
		file.close();
	}
	
}