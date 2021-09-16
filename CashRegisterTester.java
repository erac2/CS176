import java.util.Scanner;
public class CashRegisterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		CashRegister CashRegister = new CashRegister();
		
		double cost;
		double payment;
		double change;
		
		System.out.println("Enter a purchase amount, or -1 to stop: ");
		
		while (in.hasNextDouble())
		{
			double amount = in.nextDouble();
			if(amount == -1)
			{
				break;
			}
				CashRegister.recordPurchase(amount);;
				System.out.println("Enter a purchase amount, or -1 to stop: ");
		}
		System.out.println("Your payment: ");
		
		payment = in.nextDouble();
		CashRegister.receivePayment(payment);
		
		System.out.printf("Your change: %.2f", -CashRegister.giveChange());
	}

}
