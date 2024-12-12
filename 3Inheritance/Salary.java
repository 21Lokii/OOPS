import java.util.Scanner;

public class Salary
{
public static void main(String[] args)
{
int m;
char n;
Scanner input = new Scanner (System.in);

do
{
System.out.print("\n1.Programmer \n2.Team Lead \n3.Asst.Project manager \n4.Project manager\n");

m=input.nextInt();
switch(m)
{
case 1:
Programmer prog=new Programmer();
prog.input();
prog.calculateSal(prog);
prog.displaySalSlip();
break;

case 2:
TeamLead team=new TeamLead();
team.input();
team.calculateSal(team);
team.displaySalSlip();
break;

case 3:
AsstProjectManager apm=new AsstProjectManager();
apm.input();
apm.calculateSal(apm);
apm.displaySalSlip();
break;

case 4:
ProjectManager pm=new ProjectManager();
pm.input();
pm.calculateSal(pm);
pm.displaySalSlip();
break;

default:
System.out.println("Wrong Choice");
}
System.out.println("Do you  want to continue-y/n : ");
n=input.next().charAt(0);
}
while(n=='y');

System.out.println("Program Executed Successfully…");
}
}
