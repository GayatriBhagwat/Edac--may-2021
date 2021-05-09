 // Write a Java program to swap two variables. 

import java.util.Scanner;
class Swap
{
    public static void main(String args[])
{
      Scanner Sc= new Scanner(System.in);
      System.out.println("Enter Two Numbers:");
      int a= Sc.nextInt();
      int b= Sc.nextInt();
      a= a+b;
      b= a-b;
      a= a-b;
System.out.println("Swapping:");
System.out.println("a"+a);
System.out.println("b"+b);
	
           
}

}
