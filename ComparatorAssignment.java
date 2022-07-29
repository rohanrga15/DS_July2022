import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorAssignment 
{
	public static void main(String[] args) 
	{
		CompareMarks math1 = new CompareMarks(30, 40, 80);
		CompareMarks math2 = new CompareMarks(30, 40, 80);
		
		TreeSet<CompareMarks> arrLog = new TreeSet<CompareMarks>();
		
		int x = math1.compare(math1, math2);
		
		for (CompareMarks compareMarks : arrLog) {
			System.out.println(compareMarks);
		}
		
		System.out.println(x);
		
	}
}

class Marks
{
	int science;
	int maths;
	int english;
	public Marks(int science, int maths, int english) {
		super();
		this.science = science;
		this.maths = maths;
		this.english = english;
	}
	
	
}

class CompareMarks extends Marks implements Comparator<Marks>
{

	public CompareMarks(int science, int maths, int english) {
		super(science, maths, english);
		
	}

	@Override
	public int compare(Marks o1, Marks o2) {
		
		/*if(o1.maths>o2.maths)
		return 1;
		else if(o2.maths<o1.maths)
		return 0;
		else
		return -1;
		*/
		
		return Integer.compare(maths, english);
	}
	
}