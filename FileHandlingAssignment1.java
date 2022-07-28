import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingAssignment1 
{
	public static void main(String[] args) throws IOException, FileNotFoundException, InterruptedException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\RGA15\\Desktop\\file1.txt");
		
		byte b = 0;
		
		while(b != -1)
		{
			 b = (byte)file.read();
			 System.out.print((char)b);
			 Thread.sleep(10);
		}
		
		file.close();
	}
}

