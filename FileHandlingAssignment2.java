import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingAssignment2 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{	
		File f1 = new File();
		File f2 = new File();
		File f3 = new File();
		
		f1.readFile("C:/Users/RGA15/Desktop/file1.txt");
		System.out.println("");
		f2.readFile("C:\\Users\\RGA15\\Desktop\\file2.txt");
		System.out.println("");
		f3.readFile("C:\\Users\\RGA15\\Desktop\\file3.txt");
		System.out.println("");
	}
}

class File
{
	void readFile(String n) throws IOException, InterruptedException
	{
		try 
		{
			FileInputStream file = new FileInputStream(n);
			byte b = 0;
			while(b != -1)
			{
				b = (byte)file.read();
				System.out.print((char)b);
				Thread.sleep(10);
			}
			
			file.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File was not found "+e);
		}
	}

}
