
public class FunctionOverloadingTest 
{
	public static void main(String[] args) 
	{
		Tiger tigerObj = new Tiger();
		tigerObj.jump();
	}
}

class Tiger
{
	void jump()
	{
		System.out.println("jump() - Tiger is jumping");
	}
	
	void jump(int length)
	{
		System.out.println("jump(int) - Tiger is jumping "+length+" feet");
	}
	
	void jump(float length)
	{
		System.out.println("jump(float) - Tiger is jumping "+length+" feet");
	}
	
	void jump(float length, int height)
	{
		System.out.println("jump(float,int) - Tiger is jumping "+length+" feet and "+height+" height");
	}
	
	void jump(int height, float length)
	{
		System.out.println("jump(int,float) - Tiger is jumping "+length+" feet and "+height+" height");
	}
	
}