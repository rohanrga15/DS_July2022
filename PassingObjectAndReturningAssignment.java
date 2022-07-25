
public class PassingObjectAndReturningAssignment
{
	public static void main(String[] args) 
	{	
		LeavePolicies empStd = new LeavePolicies(10, 10, 12);
		
		LeavePolicies emp1 = new LeavePolicies(13, 15, 12);
		LeavePolicies emp2 = new LeavePolicies(12, 10, 12);
		LeavePolicies emp3 = new LeavePolicies(17, 10, 20);
		
		System.out.println("Leave details of employee :");
		LeavePolicies fin = empStd.setNumberOfLeaves(emp1);
		fin.showLeaves();
		fin.calculatePay();
		System.out.println("--------------------------------------------");
		
		System.out.println("Leave details of employee :");
		LeavePolicies fin2 = empStd.setNumberOfLeaves(emp2);
		fin2.showLeaves();
		fin2.calculatePay();
		System.out.println("--------------------------------------------");
		
		System.out.println("Leave details of employee :");
		LeavePolicies fin3 = empStd.setNumberOfLeaves(emp3);
		fin3.showLeaves();
		fin3.calculatePay();
		System.out.println("--------------------------------------------");
	}
}

class LeavePolicies
{
	int sickLeaves;
	int earnedLeaves;
	int casualLeaves;
	double salary;
	
	public LeavePolicies(int sickLeaves, int earnedLeaves, int casualLeaves) 
	{
		super();
		this.sickLeaves = sickLeaves;
		this.earnedLeaves = earnedLeaves;
		this.casualLeaves = casualLeaves;
	}
	
	public LeavePolicies(int sickLeaves, int earnedLeaves, int casualLeaves, double salary) 
	{
		super();
		this.sickLeaves = sickLeaves;
		this.earnedLeaves = earnedLeaves;
		this.casualLeaves = casualLeaves;
		this.salary = salary;
	}
	
	LeavePolicies setNumberOfLeaves(LeavePolicies empRef)
	{
		LeavePolicies l1 = new LeavePolicies(sickLeaves-empRef.sickLeaves, earnedLeaves-empRef.earnedLeaves, casualLeaves-empRef.casualLeaves, 5000);
		return l1;
	}
	
	void showLeaves()
	{
		System.out.println("Sick leaves   : "+sickLeaves);
		System.out.println("Earned leaves : "+earnedLeaves);
		System.out.println("Casual leaves : "+casualLeaves);
	}
	
	void calculatePay()
	{
		double d = salary/22;
		int x = sickLeaves + earnedLeaves + casualLeaves;
		d = x*d;
		System.out.println("The salary earned is "+(salary+d));
	}
}