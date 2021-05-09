// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.*;
public class Avg
{
   public static void main(String args[])
{
      Scanner Sc= new Scanner(System.in);
      System.out.println("Enter Three numbers:");
	int i= Sc.nextInt();
	int j= Sc.nextInt();
	int k=Sc.nextInt();
	int a= (i+j+k)/3;
System.out.println("Average:" +a);
}

}