
public class PaasingObjectAddReturningObjectTest 
{
	public static void main(String[] args)
	{
		
		Kite k1 = new Kite("Red", 5, "Joe", true);
//		Kite k2 = new Kite("Blue", 6, "Anna", true);
		Kite k3 = new Kite("Green", 7, "Ben", true);
		
		Kite kk = k1.flyNow(k3);
		kk.printKite();
	}
}

class Kite
{
	String colour;
	int length;
	String owner;
	boolean flyingStatus;
	
	public Kite(String colour, int length) 
	{
		super();
		this.colour = colour;
		this.length = length;
	}
	
	public Kite(String colour, int length, String owner, boolean flyingStatus) 
	{
		super();
		this.colour = colour;
		this.length = length;
		this.owner = owner;
		this.flyingStatus = flyingStatus;
	}
	
	void printKite()
	{
		System.out.println("Kite colour - "+colour);
		System.out.println("Kite length - "+length);
		System.out.println("Kite owner - "+owner);
		System.out.println("Kite flyingStatus - "+flyingStatus);
	}
	
	Kite flyNow(Kite kiteRef)
	{
		Kite kf = new Kite("Green", 20);
		return kf;
	}
	
}