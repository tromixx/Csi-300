//Tomas Venere
//Projet 1 Csi 200

import java.util.Scanner;
public class Scanner
{   public static void main(String[] args)
   {
      System.out.println("|===========================|");
      System.out.println("|                           |");
      System.out.println("|         Lawn Elite        |");
      System.out.println("|    (Fast, Eicient, Cheap) |");
      System.out.println("|                           |");
      System.out.println("|===========================|");
      
      double squareM = 2.56;
      double minutes = 0.0166666667; 
      double ammount = 0.0059305556;
      
      System.out.println("Enter how many metters do you wan to Lawn ");
      Scanner scann= new Scanner(System.in);
      double SquareM= scann.nextDouble();
      SquareM= SquareM*squareM;
      
         if (SquareM < 9999999)
         {
      
            System.out.println("Total yardage:"+
                               SquareM+
                               "square meters");
            System.out.println("Total time of service:"+   
                                SquareM*minutes +
                                "minutes");
           
            System.out.println("Total ammount:"+
                                ammount*SquareM);
            
         }  else
            {
            System.out.println("I am so sorry but our service can not help you");
            }

      

      
      
   }
      
      
}
