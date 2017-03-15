import java.util.Scanner;

public class Cat
{
  public static void main(String[] args)
  {
   double weight= 0.0;
   String mood= "QUIET";
   
   
   Scanner scan= new Scanner(System.in);
   
    If (scan= "eat")
      weight+= 1;
    
    If (scan= "poop")
      weight-= 1;
    
    If (scan= "kick")
      mood= "MEOW!";
      
    If (scan= "pet")
      mood= "PURRR"
   
    If (scan= "toString")
      System.out.println("The cat is currently in a "+ mood+ " mood and weighs "+ weight+ " lbs")
    
  }
  
  
}
