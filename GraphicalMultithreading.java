import javax.swing.JFrame;
import javax.swing.JTextField;

public class GraphicalMultithreading 
{
	public static void main(String[] args) 
	{
		BikeFrame b1 = new BikeFrame("Bikeframe1", 200, 100, 150, 100);
		BikeFrame b3 = new BikeFrame("Bikeframe3", 200, 100, 350, 100);
		BikeFrame b4 = new BikeFrame("Bikeframe4", 200, 100, 550, 100);
		b1.setVisible(true);
		b3.setVisible(true);
		b4.setVisible(true);
		b1.run();
		b3.run();
		b4.run();
		
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b3);
		Thread t3 = new Thread(b4);
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}

class BikeFrame extends JFrame implements Runnable
{
	JTextField t = new JTextField(20);
	
	BikeFrame(String title, int h, int w, int x, int y)
	{
		setSize(x, y);
		setLocation(h,w);
		setTitle(title);
		add(t);
//		setVisible(true);
	}
	public void run()
	{
		for (int i = 0; i < 1000000; i++) {
			t.setText(i+"");
		}
	}
	}
