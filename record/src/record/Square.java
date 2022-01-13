package record;
import java.util.Random;
public class Square extends Thread {
	int x;

	 Square(int n)

	 {

	 x = n;

	 }

	 public void run()

	 {

	 int sqr = x * x;

	 System.out.println("Square of " + x + " = " + sqr );

	 }
}
