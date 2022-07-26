
public class AbstractAssignment 
{
	public static void main(String[] Args)
	{
		Inception i = new Inception();
		Interstellar a = new Interstellar();
		Thor t = new Thor();
		
		i.setMovie();
		
		i.setInfo();
		t.setInfo();
		a.setInfo();
	}
}

abstract class Movie
{
	void setMovie()
	{
		System.out.println("Mandating detail setting (abstract class)");
	}
	
	abstract void setInfo();
}

class Inception extends Movie
{
	void setInfo()
	{
		System.out.println("Setting details....");
	}
}

class Interstellar extends Movie
{
	void setInfo()
	{
		System.out.println("Setting details....");
	}
}

class Thor extends Movie
{
	void setInfo()
	{
		System.out.println("Setting details....");
	}
}