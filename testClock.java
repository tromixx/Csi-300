


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
    
    //test advance method foc case 2 3 and 4 LAB!!!!!!!!!!!
    
    //test setters
    Clock time3= newClock(myhours: 10, myminutes: 24, myseconds: 45);
    System.out.printl("clock before setting hours" + time3);
    time3.setHours(14);
    System.out.printl("clock after setting hours" + time3);
    
    //test other setters    LAB!!!!!!!!!!
    //test all getters      LAB!!!!!!!!!
    
  }

}
// 232 613 131       3776
