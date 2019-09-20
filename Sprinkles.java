/**
 * @author Luis
 * 
 * Inherits from toppings decorator
 * to create the decorator to add to
 * the ice cream objects such as adding
 * to the description and cost
 */
public class Sprinkles extends ToppingsDecorator{
	IceCream iceCream;
	
	public Sprinkles(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	
	public String toString() {
		return iceCream.toString() + " + sprinkles";
	}
	
	public double getCost() {
		return iceCream.getCost() + 0.2;
	}

}
