import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest 
{
	public static void main(String[] args) {
		System.out.println("Creating the data");
		PhoneLog log1 = new PhoneLog("You missed a call", LocalDate.now(), "Missed", "Reeta");
		PhoneLog log2 = new PhoneLog("You missed a call", LocalDate.now(), "Missed", "John");
		PhoneLog log3 = new PhoneLog("You missed a call", LocalDate.now(), "Missed", "Joe");
		PhoneLog log4 = new PhoneLog("You missed a call", LocalDate.now(), "Missed", "James");
		PhoneLog log5 = new PhoneLog("You missed a call", LocalDate.now(), "Missed", "Reeta");
		
		ArrayList<PhoneLog> arrLog = new ArrayList<PhoneLog>();
		
		arrLog.add(log1);
		arrLog.add(log2);
		arrLog.add(log3);
		arrLog.add(log4);
		arrLog.add(log5);
		
		Iterator<PhoneLog> it = arrLog.iterator();
		while(it.hasNext()==true)
		{
			System.out.println(it.next());
		}
	}
}

class Log
{
	String logMessage;
	LocalDate logTime;
	public Log(String logMessage, LocalDate logTime) {
		super();
		this.logMessage = logMessage;
		this.logTime = logTime;
	}
	@Override
	public String toString() {
		return "Log [logMessage=" + logMessage + ", logTime=" + logTime + "]";
	}
	
	
}

class PhoneLog extends Log
{
	String logType;
	String message;
	public PhoneLog(String logMessage, LocalDate logTime, String logType, String message) {
		super(logMessage, logTime);
		this.logType = logType;
		this.message = message;
	}
	@Override
	public String toString() {
		return "PhoneLog [logType=" + logType + ", message=" + message + "]";
	}
	
	
}