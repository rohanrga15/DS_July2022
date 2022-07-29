
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest 
{
	public static void main(String[] args) {
		System.out.println("Creating the data");
		ChemicalElement log1 = new ChemicalElement(1.007f, "Hydrogen", "H");
		ChemicalElement log2 = new ChemicalElement(196.966f, "Gold", "Au");
		ChemicalElement log3 = new ChemicalElement(6.941f, "Lithium", "Li");
		ChemicalElement log4 = new ChemicalElement(22.970f, "Sodium", "Na");
		ChemicalElement log5 = new ChemicalElement(24.305f, "Magnesuim", "Mg");
		
		TreeSet<ChemicalElement> arrLog = new TreeSet<ChemicalElement>();
		
		arrLog.add(log1);
		arrLog.add(log2);
		arrLog.add(log3);
		arrLog.add(log4);
		arrLog.add(log5);
		
		/*Iterator<ChemicalElement> it = arrLog.iterator();
		
		while(it.hasNext()==true)
		{
			System.out.println(it.next());
		}*/
		
		for (ChemicalElement chemicalElement : arrLog) {
			System.out.println(chemicalElement);
		}
	}
}

class ChemicalElement implements Comparable<ChemicalElement>
{
	float atomicWeight;
	String atomicName;
	String atomicFormula;
	public ChemicalElement(float atomicWeight, String atomicName, String atomicFormula) {
		super();
		this.atomicWeight = atomicWeight;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
	}
	@Override
	public String toString() {
		return "ChemicalElement [atomicWeight=" + atomicWeight + ", atomicName=" + atomicName + ", atomicFormula="
				+ atomicFormula + "]";
	}
	@Override
	public int compareTo(ChemicalElement o) {
		
		System.out.println("Comparing "+o.atomicWeight+" with "+atomicWeight);
		return Float.compare(o.atomicWeight, atomicWeight);
	}
	
}











