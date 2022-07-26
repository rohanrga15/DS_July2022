
public class FinalAssignment 
{
	public static void main(String[] Args)
	{
		Atom a1 = new Atom();
			
		a1.setAtom("Hydrogen", "Hydrogen", "Oxygen", 1, 1, 1);
		
		a1.showChemical();
	}
}

class Compound
{
	String e1;
	String e2;
	String e3;
	
	final void setCompound(String a, String b, String c)
	{
		e1 = a;
		e2 = b;
		e3 = c;
	}
}

class Element extends Compound
{
	String element;
	
	final void setElement(String a)
	{
		element = a;
	}
}

final class Atom extends Element
{
	int proton;
	int neutron;
	int electron;
	
	final void setAtom(String a1, String a2, String e, int a, int b, int c)
	{
		proton = a;
		neutron = b;
		electron = c;
		e1 = a1;
		e2 = a2;
		element = e;
	}
	
	final void showChemical()
	{
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(element);
		
		System.out.println(proton);
		System.out.println(neutron);
		System.out.println(electron);		
	}
}