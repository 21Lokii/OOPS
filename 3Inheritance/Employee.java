import java.util.Scanner;
public class Employee
{
int empId;
String name;
long mobile;
String address;
String email;

public Employee()
{
this.empId=0;
this.name=null;
this.mobile=0;
this.address=null;
this.email=null;
}

public Employee(int empId, String name, long mobile, String address, String email)
{
super();
this.empId = empId;
this.name = name;
this.address = address;
this.email = email;
}

public void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Employee ID :");
this.empId=sc.nextInt();
System.out.println("Enter Employee name :");
this.name= sc.next();
System.out.println("Enter the Mobile No. :");
this.mobile=sc.nextLong();
System.out.println("Enter the Email ID :");
this.email=sc.next();
System.out.println("Enter the Address :");
this.address=sc.next();
}
public void display()
{
System.out.println("employee ID :"+empId);
System.out.println("Employee Name :"+name);
System.out.println("Mobile no :"+mobile);
System.out.println("Email ID :"+email);
System.out.println("Address :"+address);
}
}
