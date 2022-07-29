import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;

public class DeserializeHashSet 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		HashSet<Books> h1 = new HashSet<Books>();
		
		FileInputStream file = new FileInputStream("C:\\Users\\RGA15\\Desktop\\file.txt");
		ObjectInputStream obj = new ObjectInputStream(file);
		
		h1 = (HashSet<Books>) obj.readObject();
		
		System.out.println(h1);
		
		obj.close();
		file.close();
		
		for (Books books : h1) 
		{
			System.out.println(books);
		}
	}

}
