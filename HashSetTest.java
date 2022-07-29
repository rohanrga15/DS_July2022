import java.util.HashSet;
import java.util.Objects;

public class HashSetTest 
{
	public static void main(String[] args) {
	
		Book b1 = new Book("Java");
		Book b2 = new Book("Java");
		Book b3 = b2;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println("Adding books");
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		
		HashSet<Book> bookShelf = new HashSet<Book>();
		bookShelf.add(b1);
		bookShelf.add(b2);
		bookShelf.add(b3);
		
		for (Book book : bookShelf) {
			System.out.println(book);
		}
		
	}
}

class Book
{
	String title;

	public Book(String title) {
		super();
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(title, other.title);
	}
	
	
}