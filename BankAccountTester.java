
import java.io.*;
/**
   A class to test the BankAccount class.
*/
public class BankAccountTester
{
   public static void main(String[] args)
   {
	   
	      BankAccount harrysChecking = new BankAccount();
	      
	      //Bad initial Balance
	    
	      final double badBal = -500;
	      try {
	      harrysChecking.initialBalance(badBal);
	      }
	      catch (IllegalArgumentException ex)
	      {
	    	  System.out.println("Cannot enter negative balance for new account: " + badBal);
	      }
	      
	      //Good initial balance
	     
	      final double goodBal = 500;
	      try
	      {
	      harrysChecking.initialBalance(goodBal);
	      }
	      catch (IllegalArgumentException ex)
	      {
	    	  System.out.println("Cannot enter negative balance for new account: " + goodBal);
	      }
	      
	      //Bad deposit
	 
	      final double badDeposit = -100;
	      try
	      {
	      harrysChecking.deposit(badDeposit);
	      }
	      catch (IllegalArgumentException x)
	      {
	    	  System.out.println("Cannot deposit this amount: " + badDeposit);
	      }
	      
	      //Good deposit
	      
	      final double goodDeposit = 100;
	      try
	      {
	      harrysChecking.deposit(goodDeposit);
	      }
	      catch (IllegalArgumentException x)
	      {
	    	  System.out.println("Cannot deposit this amount: " + goodDeposit);
	      }
	      
	      //Bad Withdraw
	      
	      final double badWithdraw = -200;
	      try
	      {
	      harrysChecking.withdraw(badWithdraw);
	      }
	      catch (IllegalArgumentException with)
	      {
	    	  System.out.println("Cannot withdraw this amount: " + badWithdraw);
	      }
	      
	      //Good withdraw

	      final double goodWithdraw = 200;
	      try
	      {
	      harrysChecking.withdraw(goodWithdraw);
	      }
	      catch (IllegalArgumentException with)
	      {
	    	  System.out.println("Cannot withdraw this amount: " + goodWithdraw);
	      }
	      
	      //Exceeds balance
	      final double exceedsBalance = 1000;
	      try
	      {
	      harrysChecking.withdraw(exceedsBalance);
	      }
	      catch (IllegalArgumentException with)
	      {
	    	  System.out.println("Withdrawal exceeds balance: " + exceedsBalance);
	      }
	      
	      System.out.println("Account Balance is: " + harrysChecking.getBalance());
   }
}