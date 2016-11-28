/**
 * 
 */

/**
 * A cash register that takes payments and gives change.
 * @author CloudStrife
 *
 */
public class CashRegister
{
	private double purchase, payment, change;
	
	public CashRegister()
	{
		purchase = 0;
		payment = 0;
		change = 0;
	}
	
	/**
	 * Records the price of an item purchased.
	 * @param amount The price of an item purchased
	 */
	public void recordPurchase(double amount)
	{
		purchase += amount;
	}
	
	/**
	 * Enters the payment for purchase(s).
	 * @param amount The amount of payment submitted
	 */
	public void enterPayment(double amount)
	{
		payment += amount;
	}
	
	/**
	 * Returns the amount of change due to the customer.
	 * @return The amount of change due to the customer
	 */
	public double giveChange()
	{
		change = payment - purchase;
		return change;
	}
}
