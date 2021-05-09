// Write a Java program to convert a decimal number to binary number. 

class Db
{
    public static void main(String args[])
{
       int num=5;
       System.out.println("Decimal to Binary");
       long binary= convertDecimalToBinary(num);
       System.out.println(""/n + num+ " = " + binary);
}
public static long coonvertDecimalToBinary(int n) 
{
	long binaryNumber=0;
	int remainder, i=1, step=1;

		while (n!=0) {
		  remainder= n % 2;
		    n/=2;
	  	binaryNumber += remainder * i;          //  binaryNumber= binaryNumber + remainder* i
		i *= 10;
}        
      return binaryNumber;
}
}