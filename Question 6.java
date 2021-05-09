//Write a Java program to print the sum (addition), multiply, subtract, divide and 
remainder of two numbers.


import java.util.*;
class Solve
{
    public static void main(String args[])
{
         Scanner Sc= new Scanner(System.in);
	System.out.println("Enter any two numbers:");
		int i= Sc.nextInt();
		int j= Sc.nextInt();
		int k= i+j;
		int a= i-j;
		int b= i*j;
		int c= i/j;
		int d=i%j;

	System.out.println("Addition"+k);
	System.out.println("Subtraction"+a);
	System.out.println("Multiplication"+b);
	System.out.println("Division"+c);
	System.out.println("Reminder"+d);
		
                  
}
}