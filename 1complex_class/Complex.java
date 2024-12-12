import java.util.Scanner; 

public class Complex 
{ 
public static void main(String[] args) 
{ 
int ch=0,m; 
char n; 
float num1, num2, answer; 
Complex_K cal = new Complex_K(); 
Scanner input = new Scanner(System.in); 
System.out.println("Enter the first Complex no.\n"); 
num1 = input.nextInt(); 
num2 = input.nextInt(); 
Complex_K Object1 = new Complex_K(num1,num2); 
System.out.print("Enter the second Complex no.\n"); 
num1 = input.nextInt(); 
num2 = input.nextInt(); 
Complex_K Object2 = new Complex_K(num1,num2); 
do 
{ 
System.out.println("\nMENU:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter your code= "); 
m=input.nextInt(); 
switch(m) 
{ 
case 1: cal.AddNumbers(Object1,Object2); 
break; 
case 2: cal.SubNumbers(Object1,Object2); 
break; 
case 3: cal.MulNumbers(Object1,Object2); 
break; 
case 4: cal.DivNumbers(Object1,Object2); 
break; 
} 
System.out.print("\nDo you want to continue-y/n :  "); 
n=input.next().charAt(0); 
}while(n=='y'); 
} 
} 