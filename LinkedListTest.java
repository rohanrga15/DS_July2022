
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest 
{
	public static void main(String[] args) {
		System.out.println("Creating the data");
		PhoneContact log1 = new PhoneContact("James", "Bangalore", "2494561236", "james.9883@gmail.com");
		PhoneContact log2 = new PhoneContact("John", "Mumbai", "7894671236", "john.2388@gmail.com");
		PhoneContact log3 = new PhoneContact("Jim", "Japan", "8994561236", "jim.2883@gmail.com");
		PhoneContact log4 = new PhoneContact("Janet", "USA", "9094561236", "janet.23gjm@gmail.com");
		PhoneContact log5 = new PhoneContact("Jolene", "Germany", "1294561236", "jolene.28@gmail.com");
		
		LinkedList<PhoneContact> arrLog = new LinkedList<PhoneContact>();
		
		arrLog.add(log1);
		arrLog.add(log2);
		arrLog.add(log3);
		arrLog.add(log4);
		arrLog.add(log5);
		
		Iterator<PhoneContact> it = arrLog.iterator();
		
		while(it.hasNext()==true)
		{
			System.out.println(it.next());
		}
	}
}

class Contact
{
	String contactName;
	String contactNAddress;
	public Contact(String contactName, String contactNAddress) {
		super();
		this.contactName = contactName;
		this.contactNAddress = contactNAddress;
	}
	@Override
	public String toString() {
		return "Contact [contactName=" + contactName + ", contactNAddress=" + contactNAddress + "]";
	}
	
	
}

class PhoneContact extends Contact
{
	String contactNum;
	String emailAddress;
	public PhoneContact(String contactName, String contactNAddress, String contactNum, String emailAddress) {
		super(contactName, contactNAddress);
		this.contactNum = contactNum;
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "PhoneContact [contactNum=" + contactNum + ", emailAddress=" + emailAddress + "]";
	}
	
	
}












