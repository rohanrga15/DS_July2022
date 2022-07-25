
public class InheritanceTest
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("Joe",'M', 30);
		System.out.println(p1);
		
		Student s1 = new Student("Joe", 'M', 31, "Stanford", "MBA", 80);
		System.out.println(s1);
		
		Emp e1 = new Emp("Joe", 'M', 31, "Stanford", "MBA", 80, 5000.25, 825);
		System.out.println(e1);
	}
}

class Person
{
	String name;
	char gender;
	int age;
	
	public Person(String name, char gender, int age) 
	{
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	/*@Override
	public String toString() 
	{
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}*/
	
	
}

class Student extends Person
{
	String college;
	String qualification;
	int marks;
	
	public Student(String name, char gender, int age, String college, String qualification, int marks) 
	{
		super(name, gender, age);
		this.college = college;
		this.qualification = qualification;
		this.marks = marks;
	}

	/*@Override
	public String toString() 
	{
		return "Student [name=" + name + ", gender=" + gender + ", age=" + age + ", college=" + college
				+ ", qualification=" + qualification + ", marks=" + marks + "]";
	}*/

}

class Emp extends Student
{
	double salary;
	int empId;
	
	public Emp(String name, char gender, int age, String college, String qualification, int marks, double salary,
			int empId) 
	{
		super(name, gender, age, college, qualification, marks);
		this.salary = salary;
		this.empId = empId;
	}

	@Override
	public String toString() 
	{
		return "Emp [college=" + college + ", qualification=" + qualification + ", marks=" + marks + ", name=" + name
				+ ", gender=" + gender + ", age=" + age + ", salary=" + salary + ", empId=" + empId + "]";
	}
	
	
		
}
