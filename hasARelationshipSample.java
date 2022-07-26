import java.time.LocalDate;

public class hasARelationshipSample 
{
	public static void main(String[] Args)
	{
		DL d1 = new DL("Joe", "LMV", LocalDate.of(2022, 7, 22));
		
		Person2 per2 = new Person2("Joe",'M', 30, d1);
		per2.showDetails();
		
		ReportCard r1 = new ReportCard(61.25f, 35.28f, 90.15f);
		
		Student2 st1 = new Student2("Anna", 'F', 25, d1,"Stanford", "MBA", 85, r1);
		st1.showDetails2();
		
		Student2 st2 = new Student2("Anna", 'F', 25, d1,"Stanford", "MBA", 85, null);
		st2.showDetails2();
		
	}
}

class ReportCard
{
	float physics;
	float chemistry;
	float biology;
	
	public ReportCard(float physics, float chemistry, float biology) 
	{
		super();
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
	}
	
	void printCard()
	{
		System.out.println("Physics 	- " +physics);
		System.out.println("Chemistry 	- " +chemistry);
		System.out.println("Biollogy 	- " +biology);
	}
}

class DL
{
	String name;
	String type;
	LocalDate dateOfIssue;
	
	public DL(String name, String type, LocalDate dateOfIssue)
	{
		super();
		this.name = name;
		this.type = type;
		this.dateOfIssue = dateOfIssue;
	}
	
	void showDL()
	{
		System.out.println("Name       :  "+name);
		System.out.println("Type  	   :  "+type);
		System.out.println("IssueDate  :  "+dateOfIssue);		
	}

}

class Person2 
{
	String name;
	char gender;
	int age;
	DL drivLic;

	public Person2(String name, char gender, int age, DL drivLic)
	{
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.drivLic = drivLic;
	}
	
	void showDetails()
	{
		System.out.println("Name   - "+name);
		System.out.println("Gender - "+gender);
		System.out.println("Age    - "+age);
		
		if(drivLic != null)
		drivLic.showDL();
		
		else
		System.out.println("No DL info");
	}
}

class Student2 extends Person2
{
	String college;
	String qualification;
	int marks;
	ReportCard ref;

	public Student2(String name, char gender, int age, DL drivLic, String college, String qualification, int marks, ReportCard ref)
	{
		super(name, gender, age, drivLic);
		this.college = college;
		this.qualification = qualification;
		this.marks = marks;
		this.ref = ref;
	}

	void showDetails2()
	{
		showDetails();
		System.out.println("College       - "+college);
		System.out.println("Qualification - "+qualification);
		System.out.println("Marks 	      - "+marks);
		if(ref != null)
		ref.printCard();
			
		else
		System.out.println("No report card info");
	}

}

/*class Emp2 extends Student2
{
	double salary;
	int empId;
	
	public Emp2(String name, char gender, int age, DL drivLic, String college, String qualification, int marks,
			double salary, int empId) 
	{
		super(name, gender, age, drivLic, college, qualification, marks);
		this.salary = salary;
		this.empId = empId;
	}

	@Override
	public String toString() 
	{
		return "Emp [college=" + college + ", qualification=" + qualification + ", marks=" + marks + ", name=" + name
				+ ", gender=" + gender + ", age=" + age + ", salary=" + salary + ", empId=" + empId + "]";
	}
			
}*/
