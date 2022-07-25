
public class InheritanceAssignment 
{
	public static void main(String[] Args)
	{
		System.out.println("------------------------");
		System.out.println("Details  :  ");
		System.out.println("------------------------");
		
		Footwear f1 = new Footwear("Adidas", "Leather");
		f1.showDetails();
		System.out.println("------------------------");
		
		Shoes sh1 = new Shoes("Adidas", "Leather", 5000.36, 10, "Red");
		sh1.showDetails();
		System.out.println("------------------------");
		
		Sandals sa1 = new Sandals("Paragon", "Leather", 350, 10, "Open toed", "Brown");
		sa1.showDetails();
		System.out.println("------------------------");
		
		FootballShoes fsh1 = new FootballShoes("Adidas", "Leather", 5000.36, 10, "Red", "Mercurial", 5);
		fsh1.showDetails();
		System.out.println("------------------------");
		
	}
}


class Footwear
{
	String brand;
	String material;
	
	public Footwear(String brand, String material) 
	{
		super();
		this.brand = brand;
		this.material = material;
	}

	void showDetails()
	{
		System.out.println(brand);
		System.out.println(material);
	}
	
}

class Shoes extends Footwear
{
	double cost;
	int size;
	String colour;
	
	public Shoes(String brand, String material, double cost, int size, String colour)
	{
		super(brand, material);
		this.cost = cost;
		this.size = size;
		this.colour = colour;
	}
	
	void showDetails()
	{
		super.showDetails();
		System.out.println(cost);
		System.out.println(size);
		System.out.println(colour);
	}
	
}

class Sandals extends Footwear
{
	double cost;
	int size;
	String style;
	String colour;
	
	public Sandals(String brand, String material, double cost, int size, String style, String colour)
	{
		super(brand, material);
		this.cost = cost;
		this.size = size;
		this.style = style;
		this.colour = colour;
	}
	
	void showDetails()
	{
		super.showDetails();
		System.out.println(cost);
		System.out.println(size);
		System.out.println(style);
		System.out.println(colour);
	}
	
}

class FootballShoes extends Shoes
{
	String model;
	int expLevel;
	
	public FootballShoes(String brand, String material, double cost, int size, String colour, String model,
			int expLevel) 
	{
		super(brand, material, cost, size, colour);
		this.model = model;
		this.expLevel = expLevel;
	}
	
	void showDetails()
	{
		super.showDetails();
		System.out.println(model);
		System.out.println(expLevel);
	}
	
}
