package record;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rectangle dimensions:");
		Rectangle r1=new Rectangle(sc.nextInt(),sc.nextInt());
		r1.Area();
		System.out.println("Enter circle radius:");
		Circle c1=new Circle(sc.nextInt());
		c1.Area();
		System.out.println("Enter traingle dimensions");
		Triangle t1=new Triangle(sc.nextInt(),sc.nextInt());
		t1.Area();

	}

}
