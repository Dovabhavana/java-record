package record;

public class AssistantProfessor extends Employee{
	double salary,bp,da,hra,pf,club,net,gross;
	void getasst()
	{
	System.out.println("Enter basic pay");
	bp = get.nextDouble();
	}
	void calculateasst()
	{
	da=(0.97*bp);
	hra=(0.10*bp);
	pf=(0.12*bp);
	club=(0.1*bp);
	gross=(bp+da+hra);
	net=(gross-pf-club);
	System.out.println("***********************************");
	System.out.println("PAY SLIP FOR ASSISTANT PROFESSOR");
	System.out.println("***********************************");
	System.out.println("Basic Pay: Rs. "+bp);
	System.out.println("DA: Rs. "+da);
	System.out.println("HRA: Rs. "+hra);
	System.out.println("PF: Rs. "+pf);
	System.out.println("CLUB: Rs. "+club);
	System.out.println("GROSS PAY: Rs. "+gross);
	System.out.println("NET PAY: Rs. "+net);
}
}
