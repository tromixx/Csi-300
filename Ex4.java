//
//
//
//
public class Account {
  privatedouble balance;
  
  //Constructor
  public Account(double initialBalance){
    balance = initialBalance;
  }
  
  public Account()
  {
    balance= 0.0;
  
  }
  
  //instance method
  public void deposit(double amount)
  {
    balance += amount;
    
  }
  public void close()
  {
    balance= 0;
  }
  public void printStatment()
  {
    System.out.println(balance);
  }
}
