
public class PassingAndReturningObjectAssignment2 
{
	public static void main(String[] args) 
	{
		Shirt s = new Shirt();
		Stitching s1 = s.exp();
		
		System.out.println(s1);
	}
}

class Shirt
{
	Stitching exp()
	{
		Stitching cl1 = new Stitching();
		return cl1;
	}
	
}

class Stitching
{
	
}

class Cloth
{
	
}

