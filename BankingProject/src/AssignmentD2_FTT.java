
public class AssignmentD2_FTT 
{
	public static void main(String[] args) 
	{
		StrOp mcal1 = new StrOp();
		
		System.out.print("A function can ");
		mcal1.ftr1();
		System.out.print("A function can ");
		mcal1.ftr2("x arg", "y arg", "z arg");
		System.out.print("A function can ");
		String st1 = mcal1.ftr3();
		System.out.println(st1);
		System.out.print("A function can ");
		String st2 = mcal1.ftr4("x arg", "y arg", "z arg");
		System.out.print(st2);
	}
}

class StrOp
{
	//1
	void ftr1()
	{
		System.out.print(" not recieve or return args ");
		System.out.println(" ");
	}
	//2
	void ftr2(String x, String y, String z)
	{
		System.out.print(" recieve "+x+" and "+y+" and "+z);
		System.out.println(" ");


	}
	//3
	String ftr3()
	{
		return " return args";
		
	}
	//4
	String ftr4(String x, String y, String z)
	{
		System.out.print(" recieve "+x+" and "+y+" and "+z+" and ");
		return " return args";
	}
}