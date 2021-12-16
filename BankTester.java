import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BankTester {

	public static void main(String[] args) throws FileNotFoundException
	{

		try {
		Scanner in = new Scanner(new File("transactions.txt"));

		
			String trans = in.nextLine();
			SavingsAccount [] slist;
			slist = new SavingsAccount[10];
			String tranType;
			String[]fields = trans.split(",");
			tranType = fields[0];

			while (tranType != "2")
			{

				/**String[]fields = trans.split(",");

					tranType = fields[0];*/

				String accountNumber = fields[1];
				int accountNum = Integer.parseInt(accountNumber);
				String accountName = fields[2];	
				String amount1 = fields[3];
				Double amount2 = Double.parseDouble(amount1);

				int ctr = 0;

				slist[ctr] = new SavingsAccount(accountNum, accountName, amount2);

			}
			while (tranType != "9")
			{
				String accountNumber = fields[1];
				int accountNum = Integer.parseInt(accountNumber);
				String accountName = fields[2];	
				String amount1 = fields[3];
				Double amount2 = Double.parseDouble(amount1);

				for(SavingsAccount account : slist)
				{
					//slist[account].getAccount();

					int acc = account.getAccount();

					if (tranType == "3" && accountNum == acc)
					{
						account.deposit(amount2);
						System.out.println("Deposit of " + amount2 + " to account " + accountNum);
					}
					if (tranType == "4" && accountNum == acc)
					{
						account.withdraw(amount2);
						System.out.println("Withdrawal of " + amount2 + " from account " + accountNum);
					}
				}


				for(SavingsAccount account : slist)
				{
					System.out.println("Balance for account " + accountNum + " is " + account.getBalance());
				}

			}
		}

		catch(FileNotFoundException x)
		{
			System.out.println("Error");
		}




	}

}

/**catch(IllegalArgumentException x)
		{
			System.out.println("Illegal Withdrawal");
		}*/





