import java.io.*;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
 */
public class BankAccount
{  
	private double balance;

	/**
      Constructs a bank account with a zero balance.
	 */
	public BankAccount ()
	{   
		balance = 0;
	}

	/**
      Sets an initial balance.
      @param amount the initial balance
	 */
	public void initialBalance(double amount) throws IllegalArgumentException

	{  
		if(amount<0) 
			throw new IllegalArgumentException("Cannot enter negative balance for new account: " + amount);
		else
		{
			System.out.println("Sucessful new account: " + amount);
			balance = amount;
		}
	}

	/**
      Deposits money into the bank account.
      @param amount the amount to deposit
	 */
	public void deposit(double amount) throws IllegalArgumentException
	{  
		if (amount<0) 
			throw new IllegalArgumentException("Cannot withdraw this amount: " + amount); 
		
		else
		{
			System.out.println("Succesful deposit: " + amount);
		}
		double newBalance = balance + amount;
		balance = newBalance;
	}

	/**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
	 */
	public void withdraw(double amount) throws IllegalArgumentException
	{   
		if (amount<0 || amount > balance)
			throw new IllegalArgumentException("Cannot withdraw this amount: " + amount); 
		else
		{
			System.out.println("Succesful withdrawal: " + amount);
		}
		double newBalance = balance - amount;
		balance = newBalance;

	}

	/**
      Gets the current balance of the bank account.
      @return the current balance
	 */
	public double getBalance()
	{   
		return balance;
	}
}
