import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest 
{
	public static void main(String[] args) throws IOException
	{	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		try
		{
			int i = s.nextInt();
			int j = s.nextInt();
			Divide d = new Divide();
			d.div(i, j);
		}
		catch(InputMismatchException i)
		{
			System.out.println("Wrong input format it is "+i.getMessage());
		}
	}
}

class Divide
{
	void div(int a, int b)
	{
		System.out.println("start");
		
		try
		{
			int i = a;	System.out.println(i);
			int j = b;	System.out.println(j);	
			int k = i/j;System.out.println(k);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide "+e.getMessage());
		}
		
		System.out.println("end");
	}
}

class AccessString
{
	void access(String str)
	{
		System.out.println("start");
		
		try
		{
			System.out.println("The 5th element of this string is "+str.charAt(4));
		}
		
		catch(StringIndexOutOfBoundsException s)
		{
			System.out.println("There is no 5th element "+s.getMessage());
		}
	}

}


