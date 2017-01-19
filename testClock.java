


import java.util.Scanner;

public class testClock
{
  public static void main(String[] args)
  {
    //getting input from keyboard
    Scanner scan= new Scanner(system.in)
    
    
    //prompt user to enter a time
    System.out.println("Enter hours: ");
    int hours= scan.nextInt();
    
    System.out.println("Enter hours: ");
    int minutes= scan.nextInt();
    
    System.out.println("Enter hours: ");
    int seconds= scan.nextInt();
    
    //test constructor
    Clock time= new Clock(hours, minutes, seconds);
    System.out.println("\n Time using first constructor: " + time);
  }

}
