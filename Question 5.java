//Write a Java program that takes two numbers as input and display the product of 
two numbers. 


public class Product
{
   public static void main(String args[])
{
	String s1=args[0];
	String s2=args[1];
		int i=Integer.parseInt(s1);
		int j=Integer.parseInt(s2);
		int k= i*j;
{
	System.out.println("First argument:"+i);
	System.out.println("Second argument:"+j);
	System.out.println("Product is:"+k);

}
}
}