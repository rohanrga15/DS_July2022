
public class ConstructorAssignment 
{
	public static void main(String[] args) 
	{
		Phone obj1 = new Phone();
		obj1.printDetails();
		Phone obj2 = new Phone("Iphone", "13");
		obj2.printDetails();
		Phone obj3 = new Phone("Iphone", "13", 49999.99);
		obj3.printDetails();
		Phone obj4 = new Phone("Iphone", "13", 49999.99, 6);
		obj4.printDetails();
	}
}

class Phone
{
	String b;
	String m;
	double c;
	int sc;
	
	Phone()
	{
		System.out.println("--------------------------------------");
		System.out.println("No details provided");
		System.out.println("--------------------------------------");
	}
	
	Phone(String brand, String model)
	{
		System.out.println("--------------------------------------");
		System.out.println("Brand and model details provided");
		System.out.println("--------------------------------------");
		b = brand;
		m = model;	
	}
	
	Phone(String brand, String model, double cost)
	{
		System.out.println("--------------------------------------");
		System.out.println("Brand, model and cost details provided");
		System.out.println("--------------------------------------");
		b = brand;
		m = model;
		c = cost;
	}
	
	Phone(String brand, String model, double cost, int scrSize)
	{
		System.out.println("--------------------------------------");
		System.out.println("All required details provided");
		System.out.println("--------------------------------------");
		b = brand;
		m = model;
		c = cost;
		sc = scrSize;
	}
	
	void printDetails()
	{
		System.out.println("Brand : "+b);
		System.out.println("Model : "+m);
		System.out.println("Cost : "+c);
		System.out.println("Screen size : "+sc);
	}
}