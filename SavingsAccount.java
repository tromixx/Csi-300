//
//
//SavingAccount is subclass of Account
//Account is super class or base class

public class SavingsAccount extends Account
{
   private double interestRate;
   
   //subclass constructor
   //this constructor need initialize both the balance and interestRate variable
   
   public SavingAccount( double initialBalance, double initialRate)
   {
     // balance = initialBalance;
     // interestRate
     
     //invoke the Account constructor by using the word Super
     //super must come first, before the other statements in the body
     // of subclass constructor
     
     super(initialBalance);
     interestRate = initialRate;
     }
     //for subclass, you can add additional methods
     public double getInterestRate()
     {
      return interestRate;
     }
     public void setInterestRate(double rate)
     {
         interestRate = rate;
     }
    
   
   
   
   }
}
