/**
 * @author Luis
 * 
 * Inherits from toppings decorator
 * to create the decorator to add to
 * the ice cream objects such as adding
 * to the description and cost
 */
public class Cherry extends ToppingsDecorator{
	IceCream iceCream;
	
	public Cherry(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	public String toString() {
		return iceCream.toString() + " + a cherry on top";
	}
	
	public double getCost() {
		return iceCream.getCost() + 0.4;
	}
}
