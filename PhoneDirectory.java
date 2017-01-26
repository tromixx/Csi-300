import java.util.Scanner;

public class PhoneDirectory
{  
  public static void main(String [] args)
  {
    PhoneRecord [] records = new PhoneRecord[100];
    //total number of records in the array
    int numRecords = 0;
    
    //Display list of commands
    System.our.println("Phone directory commands: \n" +
                      "a- Add a new phone number\n" +
                      "f - Find a phone number\n" +
                      "q - Quit\n");
    
    //scan 1 is used for reading command
    Scanner scan1 = new Scanner(System.in);
    //scan2 is used to get other info from users
    Scanner scan1 = new Scanner(System.in);
    
    
    
    
    //read and execut commands
    while(true)
    {
      //Prompt user to enter a command
      System.out.println("Enter command (a, f or q): ");
      String command = scan1.next().trim();
      
      
      //Determine wether command is a f q or illegal; execute command if legal
      if(command.equalsIgnoreCase( anotherString: "a"))
      {
        
        //homework: fix this problem if the database is full (what happend if you have 101)!
        
        //prompt user for name and number, create a phone record and store it in database
        System.out.println("Enter new name: ");
        String name= scan2.nextLine().trim();
        System.out.println("Enter new phone number: ");
        String number = scan2.nextLine().trim();
        
        //numRecords tell you the next available position
        records[numRecords] = new PhoneRecords(name, number);
        numRecords++;
        
        
        
        
        
        
      }
      
      
      
      
    }
    
    
    
    
    
  }// end of main
  
}
