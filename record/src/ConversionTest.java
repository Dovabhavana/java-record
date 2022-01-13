import currencyconverter.*; 
import distanceconverter.*;
import timeconverter.*;
import java.util.Scanner;
import java.io.*;
@SuppressWarnings("unused")
public class ConversionTest {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Converter c1=new Converter();
	distance d1=new distance();
	Time t1=new Time();
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int ch;
	System.out.println("Enter your choice:");
	System.out.println("1.Dollar to rupees conversion");
	System.out.println("2.Rupees to Dollar conversion");
	System.out.println("3.Rupees to euro conversion");
	System.out.println("4.Rupees to Yen conversion");
	System.out.println("5.Yen to rupees conversion");
	System.out.println("6.Euro to Rupees conversion");
	System.out.println("7.Hours to seconds conversion");
	System.out.println("8.hours to minutes conversion");
	System.out.println("9.minutes to hours conversion");
	System.out.println("10.seconds to hours conversion");
	System.out.println("11.meter to kilometer conversion");
	System.out.println("12.kilometer to meter conversion");
	System.out.println("13.mile to kilometer conversion");
	System.out.println("14.kilometer to mile conversion");
	
	ch=sc.nextInt();
	switch(ch) {
	case 1:
		c1.Dollartorupees();
		
	case 2:
		c1.rupeestodollar();
		
	case 3:
		c1.rupeestoeuro();
		
	case 4:
		c1.rupeestoyen();
		
	case 5:
		c1.yentorupees();
		
	case 6:
		c1.eurotorupees();
		
	case 7:
		t1.hourstoseconds();
		
	case 8:
		t1.hourstominutes();
	case 9:
		t1.minutestohours();
		
	case 10:
		t1.secondstohours();
	case 11:
		d1.metertokm();
		
	case 12:
		d1.kmtometer();
		
	case 13:
		d1.miletokm();
		
	case 14:
		d1.kilometertomile();
		break;
	default:
		System.out.println("Your choice is not correct:");
	}
	}

}
