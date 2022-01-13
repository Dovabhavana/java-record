package currencyconverter;

import java.util.Scanner;

public class Converter {
	double rupees; 
	double dollar; 
	double euro;
	double yen;
	Scanner sc=new Scanner(System.in); 
	public void Dollartorupees() {
		System.out.println("Enter money in dollar"); 
		dollar=sc.nextDouble();
		System.out.println("IN rupees is:");
		System.out.println(dollar*74.31); 
		} 
	public void eurotorupees() {
		System.out.println("Enter money in euro"); 
		euro=sc.nextDouble(); 
		System.out.println("IN rupees is:");
		System.out.println(euro*83.85);
		} 
	public void yentorupees() { 
		System.out.println("Enter money in yen"); 
		yen=sc.nextDouble(); 
	    System.out.println("IN rupees is:"); 
	    System.out.println(yen*0.65); 
	    } 
	public void rupeestodollar() {
		System.out.println("Enter money in rupees"); 
		rupees=sc.nextDouble(); 
		System.out.println("IN dollars is:");
		System.out.println(rupees/74.31); 
		} 
	public void rupeestoyen() {
		System.out.println("Enter money in rupees"); 
		rupees=sc.nextDouble();
		System.out.println("IN yen is:");
		System.out.println(rupees/0.65);
		}
	public void rupeestoeuro() {
		System.out.println("Enter money in rupees:");
		rupees=sc.nextDouble();
		System.out.println("In euro is:");
		System.out.println(rupees/83.85);
		
	}
}
