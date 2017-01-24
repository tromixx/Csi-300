


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
    System.out.println("Time using the second constructor: " + new Clock(hours, minutes));
    System.out.println("Time using the no-arg constructor: " + new Clock());
    
    
    //Test advance method
    Clock time2 = new Clock(myhours:10, myminutes 23, myseconds: 25);
    System.out.println("clock before advance" + time2);
    time2.advance();
    System.out.println("clock after advance" + time2);
  }

}
// 232 613 131       3776
