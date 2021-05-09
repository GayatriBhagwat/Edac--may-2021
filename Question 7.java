//Write a Java program that takes a number as input and prints its multiplication 
table upto 10

import java.util.Scanner;
public class Table
{
    public static void main(String args[])
{
      Scanner Sc= new Scanner(System.in);
      System.out.println("Enter number:");
	int num1= Sc.nextInt();
	for(int i=0;i<10;i++)
{    
      System.out.println(num1 +" x " +  (i+1)  + " = " + (num1* (i+1)));

}
}
}