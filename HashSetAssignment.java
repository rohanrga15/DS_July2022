import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;

public class HashSetAssignment 
{
	public static void main(String[] args) 
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
		
		for (Books books : h1) 
		{
			System.out.println(books);
		}
	}
}

class Books implements Serializable
{
	String title;
	int number;
	String author;
	String edition;
	int pageNum;
	double price;
	public Books(String title, int number, String author, String edition, int pageNum, double price) {
		super();
		this.title = title;
		this.number = number;
		this.author = author;
		this.edition = edition;
		this.pageNum = pageNum;
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, edition, number, pageNum, price, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return Objects.equals(author, other.author) && Objects.equals(edition, other.edition) && number == other.number
				&& pageNum == other.pageNum && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Books [title=" + title + ", number=" + number + ", author=" + author + ", edition=" + edition
				+ ", pageNum=" + pageNum + ", price=" + price + "]";
	}
		
}
