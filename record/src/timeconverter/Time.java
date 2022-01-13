package timeconverter;

import java.util.Scanner;

public class Time {
	double hours;
	double seconds;
	double minutes;
	Scanner sc=new Scanner(System.in);
	public void hourstominutes() {
		System.out.println("Enter time in hours:");
		hours=sc.nextDouble();
		System.out.println("The time in minutes is:");
		System.out.println(hours*60);
		}
	public void secondstohours() {
		System.out.println("Enter time in seconds:");
		seconds=sc.nextDouble();
		System.out.println("The time in hours is:");
		System.out.println(seconds/3600);
		}
	public void hourstoseconds() {
		System.out.println("Enter time in hours:");
		hours=sc.nextDouble();
		System.out.println("The time in seconds is:");
		System.out.println(hours*3600);
		}
	public void minutestohours() {
		System.out.println("Enter time in minutes:");
		minutes=sc.nextDouble();
		System.out.println("The time in hours is:");
		System.out.println(minutes/60);
		}
}
