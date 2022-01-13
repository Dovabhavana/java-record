package record;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice,cont;
		do
		{
		System.out.println("PAYROLL");
		System.out.println(" 1.PROGRAMMER \t 2.ASSISTANT PROFESSOR \t 3.ASSOCIATEPROFESSOR \\t 4.PROFESSOR ");
		@SuppressWarnings("resource")
		Scanner c = new Scanner(System.in);
		System.out.print("Enter Your Choice:");
		choice=c.nextInt();
		switch(choice)
		{
		case 1:
		{
		Programmer p=new Programmer();
		p.getdata();
		p.getprogrammer();
		p.display();
		p.calculateprog();
		break;
		} 
		case 2:
		{
		AssistantProfessor asst=new AssistantProfessor();
		asst.getdata();
		asst.getasst();
		asst.display();
		asst.calculateasst();
		break;
		}
		case 3:
		{
		AssociateProfessor asso=new AssociateProfessor();
		asso.getdata();
		asso.getassociate();
		asso.display();
		asso.calculateassociate();
		break;
		}
		case 4:
		{
		Professor prof=new Professor();
		prof.getdata();
		prof.getprofessor();
		prof.display();
		prof.calculateprofessor();
		break;
		}
		}
		System.out.print("Please enter 0 to quit and 1 to continue: ");
		cont=c.nextInt();
		 }while(cont==1);
	}

}
