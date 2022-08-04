import java.util.Date;
import java.util.Scanner;
import java.sql.Connection;
import java.time.LocalDate;

public class NestedClassAssignment2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Aadhar number");
		int aadharnum = sc.nextInt();
		System.out.println("Enter your Aadhar name");
		String name = sc.next();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter your new Aadhar date of birth");
		String dob = sc.next();
		LocalDate dob1 = LocalDate.parse(dob);
		System.out.println("Enter your new Aadhar address");
		String ad = sc.next();
		
		Aadhar a1 = new Aadhar(name, aadharnum, dob1, ad);
		
		a1.fingerPrint(false);
	}
}

class Aadhar
{
	String name;
	int aadharNum;
	String ad;
	LocalDate d;
	
	public Aadhar(String name, int aadharNum, LocalDate d, String ad) {
		super();
		this.name = name;
		this.aadharNum = aadharNum;
		this.d = d;
		this.ad = ad;
	}
	
	void fingerPrint(boolean b)
	{
		ChangeDetails c = new ChangeDetails(d, ad);
		c.matchPrint(b);
		c.showDetails();
	}
	private class ChangeDetails
	{
		 LocalDate dob;
		 String address;
		
		 public ChangeDetails(LocalDate dob, String address) {
			super();
			this.dob = dob;
			this.address = address;
		}

		void matchPrint(boolean b)
		{
			boolean x = Fingerprint.fingerMatch(b);
			if(x == false)
			{
				this.dob = null;
				this.address = null;
			}
		}
		
		void showDetails()
		{
			System.out.println("----Details----");
			System.out.println("Name          : "+name);
			System.out.println("Aadhar number : "+aadharNum);
			System.out.println("Address       : "+address);
			System.out.println("Date of Birth : "+dob);
		}
	}
	
		static class Fingerprint
		{
			static boolean fingerMatch(boolean b)
			{
				if(b == true)
				{
					System.out.println("The fingerprint matches with the aadhar card");
					return true;
				}
				
				else
				{
					System.out.println("No match");
					System.out.println("Details not changed");
					return false;
				}
			}
		}
	}
	
	
