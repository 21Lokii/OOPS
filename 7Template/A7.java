import java.util.*;
import java.lang.*;
public class A7
{
   //FUNCTION TO CHECK PALINDROME
   static void check_palindrome(String x)
   {        
     StringBuilder s1 = new StringBuilder(x);  //StringBuilder class is mutable
     
     if(x.equals(s1.reverse().toString()))
     {            
       System.out.println(x + " is a Palindrome");
       count += 1; //count the number of palindromes
     }      
     else{     
          System.out.println(x + " is not a Palindrome");
   //FUNCTION TO CHECK EVEN OR ODD
   static void even_odd(int x)
   {
    {
      count += 1; //count the number of even numbers
    }
    }
   }
  //FUNCION TO CHECK PRIME NUMBER
    static void prime(int x)
    {
        for(int i = 2; i <= x/2; ++i)
	{
       	    {
                flag = true;
                break;
            }
        }
	{
            System.out.println(x + " is a prime number.");
            count += 1; //count the number of prime numbers
            System.out.println(x + " is not a prime number.");
    }


    {
        switch(ch){
            case 1:
                even_odd(x); //call even_odd fucntion for number x
                break;
            case 2:
                prime(x); //call prime fucntion for number x
                break;
            default:
                System.out.println("ENTER CORRECT OPTION");
        }

  //FUNCTION FOR INTEGER ARRAY
    static void number_op()
    {
        int element,n,choice;
	Scanner sc = new Scanner(System.in);
    
	//ArrayList from Collection Interface
        //Integer type

        n = sc.nextInt();
        System.out.println("Enter the elements:");
            nums.add(element); //Add elements to the ArrayList
        }
        System.out.println("1. ODD or EVEN");
        System.out.println("2. PRIME OR NOT");
        choice = sc.nextInt();
        
        count = 0;
        {
	 //Loop till there are elements in the ArrayList
        }

            System.out.println("The number of ODD numbers is: "+ (nums.size()-count));
        }
            System.out.println("The number of PRIME numbers is: "+ count);
            System.out.println("The number of Non-PRIME numbers is: "+ (nums.size()-count));
        }
    } 

  //FUNCTION FOR STRING ARRAY

    {
        int n;
        //ArrayList from COLLECTION interface
        //String type
        ArrayList<String> words = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
        }
        for(String w:words)
        {
          //Loop the ArrayList
           check_palindrome(w);
  
  public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);
	//Choose the type of List needed

        System.out.println("2. Integer");

	if(ch == 2)
            number_op(); //Calls Interger arraylist
}