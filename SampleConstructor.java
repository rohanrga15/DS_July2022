
public class SampleConstructor
{
	public static void main(String[] args)
	{
		System.out.println("--------------------");
		A obj1 = new A(3, 6, 9);
		obj1.showValues();
	}
}

class A
{
	int x;
	int y;
	int z;
	
	A(int a, int b, int c)
	{
		System.out.println("A() - Setting values");
		x = a;
		y= b;
		z = c;
		System.out.println("--------------------");
	}
	
	void showValues()
	{
		System.out.println("showValues() - Printing values");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("--------------------");
	}
}