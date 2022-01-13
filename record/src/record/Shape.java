package record;

public abstract class Shape {
	int dim1; int dim2; 
	abstract void Area();
	} 
class Rectangle extends Shape { 
	Rectangle(int x,int y) { 
		dim1=x; 
		dim2=y;
		}
	void Area() { 
		System.out.print("Areaof rectangle is:"); 
		System.out.println(dim1*dim2); 
		} 
	} 
class Triangle extends Shape{
	Triangle(int x,int y) {
		dim1=x; 
		dim2=y; 
		} 
	void Area() { 
		System.out.print("Area of Traingle is:");
		System.out.println(0.5*dim1*dim2); 
		} 
	} 
class Circle extends Shape {
	Circle(int x) {
		dim1=x;
} 
	void Area() { 
		System.out.print("Area ofcircle is:");
		System.out.println(3.14*dim1*dim1); 
		}
}
