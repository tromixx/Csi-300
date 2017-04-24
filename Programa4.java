import java.util.Scanner;
import java.io.*;

public class X
{
	public static void main(String[] args)throws IOException
	{
   
   System.out.println("Welcome to the Info-Array Program!");
	Scanner scan= new Scanner(System.in);
   int n= scan.nextInt();
   System.out.println(" How many elements are in each array?");

   if (n>0)
   {
   int[] aArray;
   aArray= new int[n];
   boolean[] bArray;
   bArray= new boolean[n];


   System.out.println("Please enter the filename for the Boolean values:");
   String filename1= scan.nextLine();   
   File folder= new File(filename1);  
   Scanner f1= new Scanner(folder);
 
   int index= 0;
   
   
   while (f1.hasNextBoolean())
   {
   bArray[index]= f1.nextBoolean();
   index ++;
   }  
   
   System.out.println("Boolean array contents");  
   System.out.println("bArray");  
   System.out.println("Total TRUEs: ");
   
   //System.out.println(every index that is true);
   System.out.println("Total FALSEs:");
   
   // System.out.println(every index that is false);
   System.out.println("Index of first TRUE:");
   
   
   
   

   System.out.println("Please enter the filename for the integer values:");
   
   String filename2= scan.nextLine();   
   File folder2= new File(filename2);
   Scanner f2= new Scanner(folder2);
   int index2= 0;
   
   
   while (f2.hasNextInt())
   {
   aArray[index2]= f2.nextInt();
   index2 ++;
   }  
   
   
   System.out.println("Integer Array Contents:");
   // String filename2= scan.nextInt();
   System.out.println("Total odd numbers");
   System.out.println("Odd elements");
   System.out.println("Index of last zero");
   System.out.println("Minimun");
   System.out.println("Maximun");
   System.out.println("Sum");
   System.out.println("Element mean is:");

   }
   else
   {
   //START AGAIN
   }
  
	
	}
}
