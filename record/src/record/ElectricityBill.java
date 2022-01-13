package record;

import java.util.Scanner;

public class ElectricityBill {
	int c_no;
	String c_name;
	double pre_r;
	double cur_r;
	char type;

	void get(){
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the consumer name");
	c_name=sc.next();
	System.out.println("enter the consumer no.");
	c_no=sc.nextInt();
	System.out.println("enter prev month reading");
	pre_r=sc.nextDouble();
	System.out.println("enter current month reading");
	cur_r=sc.nextDouble();
	System.out.println("enter the type of eb connection d/c");
	type=sc.next().charAt(0);
	}

	void show(){
	System.out.println("consumer name:"+c_name);
	System.out.println("consumer no:"+c_no);
	System.out.println("previous month reading:"+pre_r);
	System.out.println("current month reading:"+cur_r);
	}

	void Calculate(){
	double nouc=cur_r-pre_r;
	double cost;
	if(type=='d'){
	if(nouc<=100){
	cost=nouc;
	}
	else if (nouc<=200){
	cost=100+(nouc-100)*2.50;
	}
	else if(nouc<=500){
	cost=100+250+(nouc-200)*4;
	}
	else{
	cost=nouc*6;
	}
	}
	else{
	if(nouc<=100){
	cost=nouc*2;
	}
	else if(nouc<=200){
	cost=200+(nouc-100)*4.50;
	}
	else if(nouc<=500){
	cost=200+450+(nouc-200)*6;
	}
	else{
	cost=nouc*7;
	}
	}
	System.out.println("the amount to be paid"+cost);
	}
}
