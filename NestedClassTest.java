import java.util.Scanner;

public class NestedClassTest 
{
	public static void main(String[] args)
	{
		BankAccount b1= new BankAccount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number");
		int acno = sc.nextInt();
		System.out.println("Enter the password");
		String pass = sc.next();
		b1.activateAcc(acno,pass);
		b1.withdraw(500);
	}
}

class BankAccount
{
	private int acno;
	private String acname;
	private double balance;
	private BankPermission bank = new BankPermission(false, false, false);
	
	void activateAcc(int acno, String pass)
	{
		if(acno == 456789 && pass.equals("12345"))
		{
			bank.setDeposit(true);
			bank.setWithdraw(true);
			bank.setTransfer(true);
		}
		
		else
			throw new RuntimeException("Wrong account number or password");
	}
	
	void withdraw(double amt)
	{
		if(bank.isWithdraw() == false)
		{
			throw new RuntimeException("Account not activated");
		}
		
		else
		{
			System.out.println("Withdraw is allowed "+amt);
		}
	}
	
	class BankPermission
	{
		boolean withdraw;
		boolean deposit;
		boolean transfer;
		public BankPermission(boolean withdraw, boolean deposit, boolean transfer) {
			super();
			this.withdraw = withdraw;
			this.deposit = deposit;
			this.transfer = transfer;
		}
		public boolean isWithdraw() {
			return withdraw;
		}
		public void setWithdraw(boolean withdraw) {
			this.withdraw = withdraw;
		}
		public boolean isDeposit() {
			return deposit;
		}
		public void setDeposit(boolean deposit) {
			this.deposit = deposit;
		}
		public boolean isTransfer() {
			return transfer;
		}
		public void setTransfer(boolean transfer) {
			this.transfer = transfer;
		}
		
	}
}