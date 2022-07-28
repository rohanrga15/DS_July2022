import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingTest 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		try 
		{
			System.out.println("Trying to open file");
			FileInputStream fin = new FileInputStream("C:\\Users\\RGA15\\Desktop\\JavaN1.txt");
			System.out.println("File opened");
			
			byte b = (byte)fin.read();
			while(b != -1)
			{
				System.out.print((char)b);
				b = (byte)fin.read();
				Thread.sleep(10);
			}
			
			System.out.println("Trying to close file");
			fin.close();
			System.out.println("File closed");
		} 
		
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("Problem "+e);
		}
	}
}
