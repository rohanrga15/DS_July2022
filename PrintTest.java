import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintTest 
{
	public static void main(String[] args) throws IOException
	{
		Jungle.sheru.roar();
		FileOutputStream fout = new FileOutputStream("C:\\Users\\RGA15\\Desktop\\file.txt");
		PrintStream ps = new PrintStream(fout);
		
		ps.println("Hello file1");
		
		ps.close();
		fout.close();
	}
}

class Jungle //System
{
	static Tiger sheru = new Tiger(); //static PrintStream
}

class Tiger
{
	void roar() // println()
	{
		System.out.println("Tiger is roaring");
	}
}

