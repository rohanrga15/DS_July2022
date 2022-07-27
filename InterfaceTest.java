
class Photo
{
	void takePhotos1(Photographer p)	//not efficient method as it gives too  much freedom
	{
		System.out.println("-----------");
		p.act();
		p.yawn();
		p.photoClick();
		System.out.println("-----------");
	}
	
	void takePhotos2(TakePhoto p)	//efficient method as it restricts the method calls within 
	{
		System.out.println("-----------");
		//p.act(); ---> shows error
		//p.yawn(); ---> shows error
		p.photoClick();
		System.out.println("-----------");
	}
}

public class InterfaceTest 
{
	public static void main(String[] args) 
	{
		Photographer pg = new Photographer();
		
		Photo p1 = new Photo();
		p1.takePhotos1(pg);
		
		p1.takePhotos2(pg);
	}
}

interface Reactive
{
	void react();
}

interface Acting
{
	void act();
}

interface Proactive
{
	void proact();
}

interface Yawning
{
	void yawn();
}

interface TakePhoto
{
	void photoClick();
}

interface Coding
{
	void code();
}

interface Clicking
{
	void click();
}

class Person implements Reactive, Acting, Proactive, Yawning
{
	public void react()
	{System.out.println("reacting");}
	
	public void act()
	{System.out.println("acting");}
	
	public void proact()
	{System.out.println("proacting");}
	
	public void yawn()
	{System.out.println("yawning");}
	
}

class Photographer extends Person implements TakePhoto, Clicking
{	
	public void click()
	{System.out.println("click camera");}
	
	public void photoClick()
	{System.out.println("taking photos");}
	
}

class Developer extends Person implements Coding, Clicking
{
	public void code() 
	{System.out.println("coding");}
	
	public void click()
	{System.out.println("click mouse");}
	
}
