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
        
        
        
        
        
        
      } else if(command.equalsIgnoreCase( anotherString: "f"))
      {
        //prompt user for search key
        //Search the database for records whose name begin with the search key
        System.out.println("Enter name to look up: ");
        // String a = scan2.nextLine();
        // String b = b.trim();
        //String key = b.toLowerCase()
        //chaining call of instance method
        String key = scan2.nextLine().trim().toLowerCase(); //all of this method return a condition
        
        
        for(int i = 0; i < numRecords; i++)
        {
         String name= records[i].getName().toLowerCase();
          if(name.startsWith(key))
          {
            System.out.println(records[i].getName() +" "+
                               (records[i].getNumber());
            
          }
          
          
        }
        
        
        
      } else if (command.equalsIgnoreCase( anotherString: "q"))
            { 
             //command is q. terminate program
              //get out of infinite loop. Return means you want to terminate a program
              return;
            }else 
                //Command is illegal; display error
                               
                {
                 System.out.println("Command was not recognized: "+
                                    "plis enter a, f or q");
                }
      
      
      
      
    }
    
    
    
    
    
  }// end of main
  
}
