
public class CustomExceptionTest 
{
	public static void main(String[] args) 
	{
		WashingMachine washMac = new WashingMachine();
		try {
			washMac.selectProgram();
		} catch (WashingMachineIsNotException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem is "+e);
		}
	}
}

class WashingMachineIsNotException extends Exception
{
	WashingMachineIsNotException(String msg)
	{
		super(msg);
	}
}

class WashingMachine
{
	boolean current;
	WashingMachine() 
	{
		System.out.println("Do you have electricity?");
		
	}
	
	void switchOn()
	{
		if(current == false)
			current = true;
		System.out.println("Machine is on");
	}
	
	void selectProgram() throws WashingMachineIsNotException
	{
		if(current == false)
		{
			WashingMachineIsNotException wash = new WashingMachineIsNotException("No electricity");
			throw wash;
		}
		System.out.println("Program started");
		wash();
		System.out.println("Program finished");
	}
	
	void wash()
	{
		for(int i=0;i<20;i++)
			System.out.println("Washing ....");
		rinse();
	}
	
	void switchOff()
	{
		if(current == true)
			current = false;
		System.out.println("Machine is off");
	}
	
	void rinse()
	{
		for(int i=0;i<10;i++)
			System.out.println(" -> Rinsing .... ");
		spin();
	}
	
	void spin()
	{
		for(int i=0;i<10;i++)
			System.out.println("-> -> Spinning .... ");
	}
}