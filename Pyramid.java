public class Pyramid

{  

    public static void PyramidPattern(int n) 

    {  

        for (int i=0; i<n; i++) // for number of rows(n) 

{      for (int j=n-i; j>1; j--) 

            { 

                System.out.print(" "); 

            }  

            for (int j=0; j<=i; j++ ) //for number of columns

            { 

                System.out.print(" * "); 

            } 

            System.out.println(); 

        } 

    } 

    public static void main(String args[]) 

    { 

        int n = 5; 

        PyramidPattern(n); 

    } 

}