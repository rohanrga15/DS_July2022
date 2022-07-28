import java.util.InputMismatchException;
import java.util.Scanner;
import  ds.exceptions.*;

public class CustomExceptionHandlingAssignment 
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Which operating system do you have(Enter 1 or 2)");
			System.out.println("1 : Android");
			System.out.println("2 : IOS");
			int x = sc.nextInt();
			
			InputMismatchException n1 = new InputMismatchException();
			if(x != 1 && x != 2)
			throw n1;
			
			System.out.println("Enter the passcode");
			long n = sc.nextLong();
			
			if(x == 1)
				{
				Android phone1 = new Android();
				phone1.enterPasskey(n);
				System.out.println("Do you want to download this APK : Y/N");
				String str1 = sc.next();
				
				if(str1.equals("Y"))
					phone1.downloadAPK();
				
				else if(str1.equals("N"))
					System.out.println("Download cancelled");
				
				else
					throw n1;
				}
		
			else if(x == 2)
				{
					IOS phone2 = new IOS();
					phone2.enterPasskey(n);
					System.out.println("Do you want to download this APK : Y/N");
					String str1 = sc.next();
					
					if(str1.equals("Y"))
						phone2.downloadAPK();
					
					else if(str1.equals("N"))
						System.out.println("Download cancelled");
					
					else
						throw n1;
				}
			
		}
		
		catch(DownloadErrorException d)
		{
			System.out.println(d);
		}
		
		catch(WrongPasskeyException w)
		{
			System.out.println(w);
		}
		
		catch(InputMismatchException i)
		{
			System.out.println("Please use the required format "+i);
		}
	}
}

class MobilePhone
{
	void enterPasskey(long n) throws WrongPasskeyException
	{
		WrongPasskeyException w1 = new WrongPasskeyException("Wrong passcode");
		
		if(n == 12345678)
			System.out.println("Phone unlocked");
		
		else
			throw w1;
	}
	
	void downloadAPK() throws DownloadErrorException
	{
		System.out.println("The APK has been downloaded");
	}
	
}

class Android extends MobilePhone
{
	void downloadAPK() throws DownloadErrorException, VirusException
	{
		VirusException v1 = new VirusException("----Virus----");
		for(int i=0;i<10;i++)
		{
			double d = Math.random();
			if(d>0.95)
				throw v1;
		}
		System.out.println("The APK has been downloaded");
		
	}
}

class IOS extends MobilePhone
{
	void downloadAPK() throws DownloadErrorException
	{
		DownloadErrorException d = new DownloadErrorException("Cannot download unverified files");
		throw d;
	}
}

