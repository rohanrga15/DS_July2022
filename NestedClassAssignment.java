import java.util.Scanner;

public class NestedClassAssignment 
{
	public static void main(String[] args) 
	{
		Looper l = new Looper();
		l.loop();
	}
}

class Looper
{
	void loop()
	{
		loop1();
	}
	
	void loop1()
	{
		System.out.println("Enter a number between 0 and 9 including these");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Game g = new Game("Lucky number", n);
		g.playGame();
		loop();
	}
}