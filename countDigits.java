//Tomas Venere
//Csi 300
//countDigits: count the digits of a character
//26/01/2017

import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.IOException;

public class countDigits

 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, number;
        char car = 'l';
        do{
            System.out.print("Introduce the number: ");
            n = sc.nextInt();
            number= 0;    //esta variable es el contador de cifras
            while(n!=0)   //while n stillhaving numbers
            {             
             n = n/10;         //le quitamos el último dígito
             number++;          //sumamos 1 al contador de cifras
            }
            System.out.println("The number have " + number+ " digits");
            System.out.print("Continuar? ");
            try
            {
            car = (char)System.in.read();
            }
            catch (IOException e){}
            
      }while(car!='n' && car != 'N');    
    }
}
