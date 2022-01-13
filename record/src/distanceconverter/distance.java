package distanceconverter;

import java.util.Scanner;

public class distance {
	int km; 
	int mile; 
	int meter; 
	Scanner sc=new Scanner(System.in); 
	public void metertokm() { 
		System.out.println("enter distance in meters");
		meter=sc.nextInt(); 
	    System.out.print("distance in km is:"); 
	    System.out.println(meter/1000); 
	    }
	public void kmtometer() { 
		System.out.println("enter distance in kilometers"); 
		km=sc.nextInt(); 
		System.out.print("distance in meters is:"); 
		System.out.println(km*1000); 
		}
	public void kilometertomile() {
		System.out.println("enter distance in kilometers");
		km=sc.nextInt(); 
		System.out.print("distance in miles is:");
		System.out.println(km/1.6);
		} 
	public void miletokm() {
		System.out.println("enter distance in miles"); 
		mile=sc.nextInt(); 
		System.out.print("distance in km is:");
		System.out.println(mile*1.6);
		} 
}
