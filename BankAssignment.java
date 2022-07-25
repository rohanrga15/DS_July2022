
public class BankAssignment
{
	public static void main(String[] args) 
	{
		Attendance obj1 = new Attendance();
		
		obj1.setDetails(10, 12, 10, 5000);
		
		int x = obj1.sleave(11) + obj1.eleave(14) + obj1.cleave(11);
		System.out.println(x);
		obj1.salarys(x);
		obj1.showPay();
	}
}

class Attendance
{
	int cl;
	int sl;
	int el;
	int lop = 0;
	int wd = 22;
	double salary;
	
	void setDetails(int x, int y, int z, double s)
	{
		cl = x;
		sl = y;
		el = z;
		salary = s;
	}
	
	int sleave(int lv)
	{
		int s = sl;
		s = s-lv;
		return s;
	}
	
	int eleave(int lv)
	{
		int e = el;
		e = e-lv;
		return e;
	}
	
	int cleave(int lv)
	{
		int c = 0;
		c = c-lv;
		return c;
	}
	
	void salarys(int s)
	{
		if(s>(cl+sl+el))
			wd = wd - (s-(cl+sl+el));
		System.out.println(wd);
	}
	
	void showPay()
	{
		double n = salary/wd;
		double w = wd*n;
		System.out.println("Salary is "+w);
	}
}