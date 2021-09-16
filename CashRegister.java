
public class CashRegister {

		private double purchase;
		private double payment;
		
		
	CashRegister()
	{
	purchase = 0;
	payment = 0;
	}

	/**
	 * Records the sale of an item
	 */
	
	public void recordPurchase(double cost)
	{
		purchase = purchase + cost;
	}
	
	/**
	 * Processes a payment received from the customer.
	 */
	
	public void receivePayment(double paymentReceived)
	{
		payment = payment + paymentReceived;
	}
	
	/**
	 * Computes the change due and resets the machine for the next customer.
	 * the change due to the customer
	 */
	
	public double giveChange()
	{
		double change = purchase - payment;
		purchase = 0;
		payment = 0;
		return change;
	}

}
