/**
   Reimplement the CheckingAccount class below so that the
   first withdrawal is free but each addiitional withdrawal during a month incurs $20 fee.

Add code below to make CheckingAccount a subclass of BankAccount
*/

public class CheckingAccount extends BankAccount
{
	private int withdraw;

/**
Add an instance variable below that keeps track of the number of withdrawals each month
*/   


   /**
      Constructs a checking account with a zero balance. Set withdrawals to 0 as well
   */
   public CheckingAccount()
   {
	   super.getBalance();
	   withdraw = 0;
   }

   /**
      Add code below. If more than 1 withdrawal in month. Withdraw an extra 20 from BankAccount balance
   */
   public void withdraw(double amount)
   {
	   withdraw = withdraw + 1;
	   
	   if (withdraw < 2)
	   {
		   super.withdraw(amount);
	   }
	   else
	   {
		   super.withdraw(amount + 20);
	   }
	   
   }

   /**
      Add code to End of month procedure to reset number of withdrawals to 0 
   */
   public void monthEnd()
   {
	   withdraw = 0;
   }
}

