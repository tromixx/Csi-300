//********************************************************************
//  BasicArray.java       Author: Lewis/Loftus
//
//  Demonstrates basic array declaration and use.
//********************************************************************

public class BasicArray
{
   //-----------------------------------------------------------------
   //  Creates an array, fills it with various integer values,
   //  modifies one value, then prints them out.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int LIMIT = 15, MULTIPLE = 10;

      int[] list = new int[LIMIT];
      
      //  Initialize the array values
      for (int index = 0; index < LIMIT; index++)
         list[index] = index * MULTIPLE;
      
      list[5] = 999;  // change one array value
      
      //  Print the array values
      for (int value : list)
         System.out.print (value + "  ");
   }
}









//********************************************************************
//  Family.java       Author: Lewis/Loftus
//
//  Demonstrates the use of variable length parameter lists.
//********************************************************************

public class Family
{
   private String[] members;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this family by storing the (possibly
   //  multiple) names that are passed in as parameters.
   //-----------------------------------------------------------------
   public Family (String ... names)
   {
      members = names;
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this family.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = "";

      for (String name : members)
         result += name + "\n";

      return result;
   }
}










//********************************************************************
//  Grade.java       Author: Lewis/Loftus
//
//  Represents a school grade.
//********************************************************************

public class Grade
{
   private String name;
   private int lowerBound;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this Grade object with the specified
   //  grade name and numeric lower bound.
   //-----------------------------------------------------------------
   public Grade (String grade, int cutoff)
   {
      name = grade;
      lowerBound = cutoff;
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this grade.
   //-----------------------------------------------------------------
   public String toString()
   {
      return name + "\t" + lowerBound;
   }

   //-----------------------------------------------------------------
   //  Name mutator.
   //-----------------------------------------------------------------
   public void setName (String grade)
   {
      name = grade;
   }

   //-----------------------------------------------------------------
   //  Lower bound mutator.
   //-----------------------------------------------------------------
   public void setLowerBound (int cutoff)
   {
      lowerBound = cutoff;
   }

   //-----------------------------------------------------------------
   //  Name accessor.
   //-----------------------------------------------------------------
   public String getName()
   {
      return name;
   }

   //-----------------------------------------------------------------
   //  Lower bound accessor.
   //-----------------------------------------------------------------
   public int getLowerBound()
   {
      return lowerBound;
   }









//********************************************************************
//  GradeRange.java       Author: Lewis/Loftus
//
//  Demonstrates the use of an array of objects.
//********************************************************************

public class GradeRange
{
   //-----------------------------------------------------------------
   //  Creates an array of Grade objects and prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Grade[] grades =
      {
         new Grade("A", 95), new Grade("A-", 90),
         new Grade("B+", 87), new Grade("B", 85), new Grade("B-", 80),
         new Grade("C+", 77), new Grade("C", 75), new Grade("C-", 70),
         new Grade("D+", 67), new Grade("D", 65), new Grade("D-", 60),
         new Grade("F", 0)
      };

      for (Grade letterGrade : grades)
         System.out.println (letterGrade);
   }
}










//********************************************************************
//  ReverseOrder.java       Author: Lewis/Loftus
//
//  Demonstrates array index processing.
//********************************************************************

import java.util.Scanner;

public class ReverseOrder
{
   //-----------------------------------------------------------------
   //  Reads a list of numbers from the user, storing them in an
   //  array, then prints them in the opposite order.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Scanner scan = new Scanner (System.in);

      double[] numbers = new double[10];

      System.out.println ("The size of the array: " + numbers.length);

      for (int index = 0; index < numbers.length; index++)
      {
         System.out.print ("Enter number " + (index+1) + ": ");
         numbers[index] = scan.nextDouble();
      }
      
      System.out.println ("The numbers in reverse order:");

      for (int index = numbers.length-1; index >= 0; index--)
         System.out.print (numbers[index] + "  ");
   }
}








import java.util.Scanner;
public class LoopDemos
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Please enter a positive number: ");
      int response = scan.nextInt();
      
      System.out.println("The positive number is " + response);
   }
}














public class SequentialAccessLab
{
   public static void main(String[] args)
   {
      int numbers = {-1, 0, 14, -6, 2, 4, 0, 0, 3, 10, -11, -5, 8, 15};
      
      //Find the sum of the elements in the array
      
      //Search for a particular value
      
      //Count occurrences of a certain value
      
      //Find the largest or smallest value in an array
   }
}













Loop Transformation Lab Solution
Here is my example solution for using each of the three loops to print out the values 1 through 20 on the same line:
//Tobias solution from class on 4/5/2017
public class LoopTransformations
{
   public static void main(String[] args)
   {
      //WHILE-LOOP version
      System.out.println("While-Loop version:");
      int num = 1;
      while(num < 21)
      {
         System.out.print(num + " ");
         num++;
      }

      //DO-LOOP version
      System.out.println("\nDo-Loop version:");
      num = 1;
      do
      {
         System.out.print(num + " ");
         num++;
      }while(num < 21);

      //FOR-LOOP version
      System.out.println("\nFor-Loop version:");
      for(num = 1; num < 21; num++)
      {
         System.out.print(num + " ");
      }
   }
}











import java.util.Scanner;
public class PracticeExercises
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Please enter a String: ");
      String str = scan.nextLine();
      
      //Solution for (1)
      for(int i = str.length()-1; i >= 0; i--)
      {
         System.out.print(str.charAt(i));
      }
      
      //Calling method solution below for testing
      System.out.println("\nTriangle sides 5, 5, 5: " + isIsosceles(5, 5, 5));
      System.out.println("Triangle sides 5, 4, 5: " + isIsosceles(5, 4, 5));
      System.out.println("Triangle sides 4, 5, 5: " + isIsosceles(4, 5, 5));
      System.out.println("Triangle sides 5, 5, 4: " + isIsosceles(5, 5, 4));
      System.out.println("Triangle sides 3, 4, 5: " + isIsosceles(3, 4, 5));
      
      //Solutions for (3, parts a-c)
      int count = 0;
      for(int i = 1; i <=20; i++)
      {
         count++;
      }
      System.out.println("a. " + count);
      
      count = 0;
      for(int i = 5; i <20; i+=1)
      {
         count++;
      }
      System.out.println("b. " + count);
      
      count = 0;
      for(int i = 20; i > 0; i = i-2) //the worksheet looks like i = l-2 
      {                               //that is just because MS word is dumb sometimes
         count++;                     //and randomly capitalized the i in the equation...
      }
      System.out.println("c. " + count);
      System.out.print("\nPlease enter an integer: ");
      int number = scan.nextInt();
      
      //Solution for (4)
      for(int k = 0; k < 6; k++)
      {
         System.out.println(number + " X " + k + " = " + (number * k));
      }
   }
   
   //Solution for (2)
   public static boolean isIsosceles(int s1, int s2, int s3)  //static is needed because this method 
   {                                                  //is in the same class file as the main method

      if((s1 == s2 || s2 == s3 || s3 == s1) && !(s1 == s2 && s2 == s3))
         return true;
      else
         return false;
   }
}

