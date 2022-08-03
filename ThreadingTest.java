
public class ThreadingTest 
{
	public static void main(String[] args) 
	{
		MyMessage m1 = new MyMessage("ping");
		MyMessage m2 = new MyMessage("\tpong");
		MyMessage m3 = new MyMessage("\t\tpang");
		
		m1.start();
		m2.start();
		m3.start();
	}
}

class MyMessage extends Thread
{
	String msg;
	
	MyMessage(String msg)
	{
		this.msg = msg;
	}
	
	public void run()
	{
		for (int i = 0; i < 100; i++) {
			System.out.println(i+" "+msg);
		}
	}
}