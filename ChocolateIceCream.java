/**
 * @author Luis
 * 
 * inherits from Ice Cream class
 * and adds a description to the ice cream
 * object as well as its original cost 
 */
public class ChocolateIceCream extends IceCream{
	
	public ChocolateIceCream() {
		this.description = "Chocolate Ice Cream";
	}
	
	public double getCost() {
		return 0.9;
	}
}
