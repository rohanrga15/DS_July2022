
public class FunctionTypeTest 
{

	public static void main(String[] args) 
	{	
		Calculator mcal1 = new Calculator();
		
		mcal1.fun1();
		mcal1.fun2(24, 43.7f, 33.5);
		int x = mcal1.fun3();
		System.out.println("Return value is "+x);
		System.out.println("----------------------");
		double y = mcal1.fun4(24, 43.7f, 33.5);
		System.out.println("Return value is "+y);
		System.out.println("----------------------");
	}

}

class Calculator
{
	//1
	void fun1()
	{
		System.out.println("fun1");
		System.out.println("----------------------");
	}
	//2
	void fun2(int x, float y, double z)
	{
		System.out.println("fun2");
		System.out.println("x = "+x+"y = "+y+"z = "+z);
		System.out.println("----------------------");
		/*
		System.out.println("y = "+y);
		System.out.println("z = "+z);
		*/
	}
	//3
	int fun3()
	{
		System.out.println("fun3");
		return 32;
	}
	//4
	double fun4(int x, float y, double z)
	{
		System.out.println("fun4");
		System.out.println("x = "+x+"y = "+y+"z = "+z);
		/*
		System.out.println("y = "+y);
		System.out.println("z = "+z);
		*/
		return 3.58f;
	}
}