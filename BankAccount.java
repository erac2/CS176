/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/
public class BankAccount 
{
   private double balance;
   private int accountNumber;
   private String accountName;

   public BankAccount(int acct,String name, double bal)
   {
      this.balance = bal;
      this.accountNumber = acct;
      this.accountName = name;
   }

   public void deposit(double amount)
   {
      balance = balance + amount;
   }

   public void withdraw(double amount)
   {
      balance = balance - amount;
   }

   public double getBalance()
   {
      return balance;
   }
   public int getAccount()
   {
	   return accountNumber;
   }
}
