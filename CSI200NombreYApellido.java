//Initial Lab from class on 2/20
//Write a program that requests a users first and last name.  Use
//String methods to pull out and display the person's initials to the
//Screen.  Ex.  nicole tobias  should produce the result N. T.

import java.util.Scanner;

public class CSI200NombreYApellido
{
   public static void main(String[] args)
   {
      String fName, lName, initials;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Please enter your first name:  ");

      fName = scan.nextLine();
         
      System.out.print("Please enter your last name:  ");
   
      Scanner scan2 = new Scanner(System.in);
  
      lName= scan2.nextLine();
      
      initials= fName.charAt(0)+ "."+ lName.charAt(0)+ ".";
      initials= initials.toUpperCase();
      
      
         
      System.out.println("Your initials are:  " + initials);  
   }
}
