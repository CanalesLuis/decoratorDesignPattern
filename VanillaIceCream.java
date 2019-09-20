/**
 * @author Luis
 * 
 * inherits from Ice Cream class
 * and adds a description to the ice cream
 * object as well as its original cost 
 */
public class VanillaIceCream extends IceCream{
	
	public VanillaIceCream() {
		this.description = "Vanila Ice Cream";
	}
	
	public double getCost() {
		return 0.75;
	}
}
