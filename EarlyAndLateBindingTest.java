
public class EarlyAndLateBindingTest 
{
	public static void main(String[] args) 
	{
		Doctor d1 = new Doctor();
		d1.diagnose();
		
		Surgeon s1 = new Surgeon();
		s1.diagnose();
		
		HeartSurgeon h1 = new HeartSurgeon();
		h1.diagnose();
		
		if(d1 instanceof Doctor)
		System.out.println("Yes d1 is pointing to ref of Doctor");
		
		if(s1 instanceof Doctor)
			System.out.println("Yes s1 is pointing to ref of Doctor");
		if(s1 instanceof Surgeon)
			System.out.println("Yes s1 is pointing to ref of Surgeon");
		
		if(h1 instanceof Doctor)
			System.out.println("Yes h1 is pointing to ref of Doctor");
		if(h1 instanceof Doctor)
			System.out.println("Yes h1 is pointing to ref of a Surgeon");
		if(h1 instanceof Doctor)
			System.out.println("Yes h1 is pointing to ref of a HeartSurgeon");
		
		Doctor ref1 = s1;
		Doctor ref2 = h1;
		
		ref1.diagnose();	//compiler shows Doctor class diagnose()
		ref2.diagnose();	//compiler shows Doctor class diagnose()
	
		//During the time of execution, late binding occurs and diagnose() is overridden
		
	}
}

class Doctor 
{
	void diagnose()
	{
		System.out.println("Doctor : diagnose() - checkup");
	}
}

class Surgeon extends Doctor
{
	void diagnose()
	{
		System.out.println("Surgeon : diagnose() - CT scancheckup");
	}
}

class HeartSurgeon extends Surgeon
{
	void diagnose()
	{
		System.out.println("HeartSurgeon : diagnose() - heart checkup");
	}
}