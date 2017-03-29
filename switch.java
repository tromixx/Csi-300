import java.util.Scanner;
public class switchEx
{
   public static void main(String[] args)
   {
      System.out.println("The break statement does wich of the following"+
                        "\n\t a) ends the program"+
                        "\n\t b) transfer control out of the current control"+
                        "\n\t c) ends the current line of output, returning the cursor"+
                        "\n\t d) denotes the ending of switch statment"+
                        "\n\t e) indicates the end of the line when using System.out.println")
         system.out.print("Please enter your answer");
         Scanner scan = new Scanner(System.in)
         char response = scan.next()charAt(0)
            
            switch(response)
            {
               case 'a': System.out.println("incorrect!");
               case 'b': System.out.println("incorrect!");
               case 'c': System.out.println("incorrect!");
               case 'd': System.out.println("incorrect!");
               case 'e': System.out.println("incorrect!");
               default: System.out.println("Invalid response, you idiot!");     
                   
            }
   }

}
