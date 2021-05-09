// Write a Java program to print the area and perimeter of a rectangle. 

import java.util.Scanner;
class Rect
{
    public static void main(String args[])
{
   Scanner Sc= new Scanner(System.in);
   System.out.println("Enter Length and Width of Rectangle:");
   int l = Sc.nextInt();
   int w =Sc.nextInt();
   int p= (2*l)+(2*w);
   int a= (l*w);
	 System.out.println("Perimeter of Rectangle is:" +p);
	 System.out.println("Area of Rectangle is:" +a);

}   
}