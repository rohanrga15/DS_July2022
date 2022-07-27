
class Retailer
{
	void getAnyBiscuit(LocalFactory b)
	{
		System.out.println("--------------------");
		b.brittaniaWrapper();
		b.sealProduct();
		b.offBrand();
		b.fakeQualityTest();
		System.out.println("--------------------");
	}
	
	void getGoodBiscuit(OpenFactory o)
	{
		System.out.println("--------------------");
		o.getContract();
		o.brittaniaWrapper();
		o.sealProduct();
		o.qualityTest();
		//o.fakeQualityTest(); ----> error, the class does not permit this method
		//o.offBrand(); ----> error, the class does not permit this method
		System.out.println("--------------------");
	}
}

public class InterfaceAssignment 
{
	public static void main(String[] args) 
	{
		LocalFactory b1 = new LocalFactory();
		Retailer r1 = new Retailer();
		r1.getAnyBiscuit(b1);
		r1.getGoodBiscuit(b1);
	}
}

class LocalFactory implements OpenFactory, LocalIngredients
{
	public void brittaniaWrapper() 
	{
		System.out.println("Brittania wrapper");
	}
	public void sealProduct() 
	{
		System.out.println("Product sealed");
	}
	public void makeBiscuit() 
	{
		System.out.println("Bicuit made");
	}
	public void qualityTest() 
	{
		System.out.println("Quality tested");
	}
	public void fakeQualityTest() 
	{
		System.out.println("Quality not tested");
	}
	public void satifyRequirements()
	{
		System.out.println("Requirements satisfied");
	}
	public void getContract() 
	{
		System.out.println("Contract approved");
	}
	public void useLocal() 
	{
		System.out.println("Local Ingredients");
	}
	public void offBrand()
	{
		System.out.println("Off brand biscuits");
	}
}