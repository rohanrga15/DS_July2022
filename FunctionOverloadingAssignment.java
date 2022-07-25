
public class FunctionOverloadingAssignment 
{
	public static void main(String[] args) 
	{
		System.out.println("-----------------------------------------------------");
		Time timeObj = new Time();
		timeObj.timeTaken();
		timeObj.timeTaken(50);
		timeObj.timeTaken(50, 100);
		timeObj.timeTaken(70, 60, 5);
		timeObj.timeTaken(70, 80, 2, 3);
	}
}

class Time
{
	void timeTaken()
	{
		System.out.println("The minimum amount of time taken is 5 mins");
		System.out.println("-----------------------------------------------------");
	}
	
	void timeTaken(double dist)
	{
		System.out.println("Assuming avg speed as 50km/hr");
		System.out.println("The amount of time taken is "+dist/50+" hours");
		System.out.println("-----------------------------------------------------");
	}
	
	void timeTaken(double dist, double speed)
	{
		System.out.println("The amount of time taken is "+dist/speed+" hours");
		System.out.println("-----------------------------------------------------");
	}
	
	void timeTaken(double dist, double speed, int restStops)
	{
		System.out.println("Assuming avg rest stop time taken as 5 mins");
		double d = (dist/speed) + ((restStops*5)/60);
		System.out.println("The amount of time taken is "+d+" hours");
		System.out.println("-----------------------------------------------------");
	}
	
	void timeTaken(double dist, double speed, int restStops, int trafficLevel)
	{
		System.out.println("Assuming avg rest stop time taken as 5 mins");
		System.out.println("Traffic levels from 1-10");
		double d = (dist/speed) + ((restStops*5)/60+ ((trafficLevel*5)/60));
		System.out.println("The amount of time taken is "+d+" hours");
		System.out.println("-----------------------------------------------------");
	}
}