// Write a Java program to convert a decimal number to octal number.

import java.util.Scanner;
class DO
{
  public static void main(String args[])
  {
 Scanner input = new Scanner( System.in );
 System.out.print("Enter a decimal number : ");
    int num =input.nextInt();
    int rem;
    String str=""; 
    char dig[]={'0','1','2','3','4','5','6','7'};
 
    while(num>0)
    {
       rem=num%8; 
       str=dig[rem]+str; 
       num=num/8;
    }
    System.out.println("Decimal to octal: "+str);
  }
}