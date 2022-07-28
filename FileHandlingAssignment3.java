import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingAssignment3 
{
	public static void main(String[] args) throws IOException, FileNotFoundException, InterruptedException
	{
		MyFileReader f1 = new MyFileReader("C:/Users/RGA15/Desktop/file1.txt");
		f1.readFile();
		f1.closeFile();
		System.out.println();
		
		MyFileReader f2 = new MyFileReader("C:/Users/RGA15/Desktop/file2.txt");
		f2.readFile();
		f2.closeFile();
		System.out.println();
		
		MyFileReader f3 = new MyFileReader("C:/Users/RGA15/Desktop/file3.txt");
		f3.readFile();
		f3.closeFile();
		System.out.println();
	}
}

class MyFileReader
{
	FileInputStream file;
	
	MyFileReader (String s)
	{
		try 
		{
			file = new FileInputStream(s);
		} 
		
		catch (FileNotFoundException e) 
		{
			System.out.println("File cannot be found");
		}
	}
	
	void readFile() throws IOException, InterruptedException
	{
		byte b = 0;
		
		while(b != -1)
		{
			 b = (byte)file.read();
			 System.out.print((char)b);
			 Thread.sleep(10);
		}
	}
	
	void closeFile() throws IOException
	{
		file.close();
	}
}