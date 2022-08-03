
public class ThreadTest1 
{
	public static void main(String[] args) 
	{
		Bike b1 = new Bike();
		Car c1 = new Car();
		Train t1 = new Train();
		Aircraft a1 = new Aircraft();
		
		b1.start();
		c1.start();
		t1.start();
		a1.start();
		
		
	}
}

class Bike extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Bike is running "+i);
		}
	}
}

class Car extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("\tCar is running "+i);
		}
	}
}

class Train extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("\t\tTrain is running "+i);
		}
	}
}

class Aircraft extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Aircraft\t\t\t is running "+i);
		}
	}
}