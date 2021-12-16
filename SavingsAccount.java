
public class SavingsAccount extends BankAccount
{

	
   public SavingsAccount(int accountNum, String accountName, Double amount2)
   {
	   super(accountNum, accountName, amount2);
	   
   }
   
   public void withdraw(double amount)
   {
	   if (amount>super.getBalance())
	   {
		   System.out.println("Cannot withdraw " + amount + " from account ");
	   }
	   super.withdraw(amount);
   }	


   
}
