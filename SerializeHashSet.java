import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class SerializeHashSet 
{
	public static void main(String[] args) throws IOException 
	{
		Books b1 = new Books("Java", 23, "James Gosling", "1st edition", 300, 5200);
		Books b2 = new Books("Jungle Book", 73, "Rudyard Kipling", "10th edition", 150, 850);
		Books b3 = new Books("Java", 23, "James Gosling", "1st edition", 300, 5200);
		Books b4 = b2;
		
		HashSet<Books> h1 = new HashSet<Books>();
		h1.add(b1);
		h1.add(b2);
		h1.add(b3);
		h1.add(b4);
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\RGA15\\Desktop\\file.txt");
		ObjectOutputStream obj = new ObjectOutputStream(file);
		obj.writeObject(h1);
		obj.close();
		file.close();
		
		for (Books books : h1) 
		{
			System.out.println(books);
		}
	}

}
