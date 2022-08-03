

public class Game
{
	String name;
	int num;
	static int a;
	
	public Game(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}

	private Levels l = new Levels();
	
	void playGame()
	{
		l.setNum(num);
		boolean b = l.logic();

		if(b == true)
		{
			l.setLevelno(a+1);
			l.printLevel();
		}
		
		else
		{
			System.out.println("Try again");
		}
	}
	
	class Levels
	{
		int levelno;
		int num;

		public int getLevelno() {
			return levelno;
		}
		
		public void setLevelno(int levelno) {
			this.levelno = levelno;
		}
		
		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}
		
		void printLevel()
		{
			System.out.println("Advanced to next level");
		}

		boolean logic()
		{
			double x = Math.random() * 10;
			int y = (int)x;
			if(num == 5)
				return true;
			else
				return false;
		}
	}
}