import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileCharacterBasedTest 
{
	public static void main(String[] args) throws IOException, FileNotFoundException, InterruptedException
	{
		FileReader file = new FileReader("C:\\Users\\RGA15\\Desktop\\file1.txt");
		
		int b = 0;
		
		while(b != -1)
		{
			 b = file.read();
			 System.out.print((char)b);
			 Thread.sleep(10);
		}
		
		file.close();
	}
}
