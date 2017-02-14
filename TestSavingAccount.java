// Created by Tommy

public class TestSavingAccount 
 {
  public static void main(String[] args)
  {
    SavingsAccount savingAcct = new SavingsAccount( initialBalance: 100, initialRate:0.1);
   
    System.out.println("Rate: " = savingAcct.getInterestRate());
   
    savingAcct.setInterestRate(0.5);
   
    savingAcct.deposit(amount: 500.0);
  }
    
    
    
 }
