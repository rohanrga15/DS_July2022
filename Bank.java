import java.io.*;
public class Bank 
{

	public static void main(String[] args)throws IOException 
	{
		int k = 0;
		
		DataInputStream inp = new DataInputStream(System.in);
		System.out.println("Banking started ..... ");
		BankAccount obj1 = new BankAccount();
		obj1.setAccDetails(96125874, "Rohan", 200000);
		
		obj1.printAccDetails();
		
		System.out.println("Enter the number of transactions");
		int n = Integer.parseInt(inp.readLine());
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the type of transaction - W(1) / D(2)");
			int k1 = Integer.parseInt(inp.readLine());
			System.out.println("Enter the amount");
			int a = Integer.parseInt(inp.readLine());
			if(k1 == 1)
				{
					obj1.withdraw(a);
					obj1.printAccDetails();
					double dd = obj1.dynamicInterest();
					System.out.println("Current dynamic interest calculated is : "+dd);
				}
			if(k1 == 2)
				{
					obj1.deposit(a);
					obj1.printAccDetails();
					double dd = obj1.dynamicInterest();
					System.out.println("Current dynamic interest calculated is : "+dd);
				}		
		}
//		obj1.withdraw(32587);
//		obj1.deposit(40000);
		
		obj1.printAccDetails();
		obj1.staticInterest(null);
	}

}

class BankAccount
{
	int accNumber;
	String accHolderName; 
	double balance = 50000;
	
	void setAccDetails(int x, String str, double d)
	{
		System.out.println("Setting details");
		accNumber = x;
		accHolderName = str;
		balance = d;
	}
	void withdraw(double amtToWithdraw)
	{
		System.out.println("withdrawing .... ");
		balance = balance-amtToWithdraw;
	}
	
	void deposit(double amtToDeposit)
	{
		System.out.println("depositing .... ");
		balance = balance + amtToDeposit;
	}
	
	double getBalance()
	{
		return balance;
	}
	
	void printAccDetails()
	{
		System.out.println("-----------------------");
		System.out.println("Acc number : "+accNumber);
		System.out.println("Acc holder name : "+accHolderName);
		System.out.println("Balance : "+balance);
		System.out.println("-----------------------");
	}
	
	double dynamicInterest()
	{
		double x = balance*0.04; 
		return x;
	}
	
	double staticInterest(double[] a )
	{
		double x = balance*0.04; 
		return x;
	}
}
