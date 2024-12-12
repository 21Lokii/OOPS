import java.util.Scanner;
public class Programmer extends Employee
{
double bp,da,hra,pf,club,net,gross,deduct;
public Programmer()
{
this.bp = 0;
this.da = 0;
this.hra = 0;
this.pf = 0;
this.club = 0;
this.net = 0;
this.gross = 0;
this.deduct = 0;
}

public Programmer(double bp, double da, double hra, double pf, double club, double net, double gross, double deduct)
{

this.bp = bp;
this.da = da;
this.hra = hra;
this.pf = pf;
this.club = club;
this.net = net;
this.gross = gross;
this.deduct = deduct;
}
public double getBasicPay()
{

Scanner sc = new Scanner(System.in);
System.out.println ("Enter basic pay for programmer :");
bp = sc.nextDouble();
return bp;
}

public void calculateSal(Programmer p)
{
double bp = p.getBasicPay();

da=0.97*bp;
hra=0.10*bp;
pf=0.12*bp;
club=0.001*bp;
gross=bp+da+hra;
deduct=pf+club;
net=gross+deduct;
}

public void displaySalSlip()
{
System.out.println ("\n\n ****PROGRAMMER SALARY SLIP ****\n");

this.display();
System.out.println ("Basic Pay : "+this.bp);
System.out.println ("DA : "+this.da);
System.out.println ("HRA : "+this.hra);
System.out.println ("PF : "+this.pf);
System.out.println ("Staff Club : "+this.club);
System.out.println ("\n Gross SAlary : "+this.gross);
System.out.println ("\n Deduction in salary : "+this.deduct);
System.out.println ("\n Net Salary :"+this.net);
}
}
