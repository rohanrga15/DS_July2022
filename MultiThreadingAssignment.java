
public class MultiThreadingAssignment 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Restaurant c1 = new Restaurant("dosa");
		Restaurant c2 = new Restaurant("upma");
		Restaurant c3 = new Restaurant("poha");
		
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c1.getName());

		System.out.println(c1.isAlive());
		System.out.println(c2.isAlive());
		System.out.println(c3.isAlive());

		c1.start();
		c2.start();
		c3.start();
		
		System.out.println(c1.isAlive());
		System.out.println(c2.isAlive());
		System.out.println(c3.isAlive());
		
		c1.join(); //awaits for c1 to die
		c2.join();
		c3.join();
		
		System.out.println("End of main");
	}
}

class Restaurant extends Thread
{
	String msg;
	
	Restaurant(String msg)
	{
		this.msg = msg;
	}
	
	public void run()
	{
		for (int i = 1; i < 100; i++) {
			System.out.println("Customer "+i+" gets "+msg);
		}
	}
}