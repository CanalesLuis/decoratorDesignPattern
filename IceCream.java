/**
 * @author Luis
 * 
 * abstract class in which all other classes
 * inherit from, directly extend to
 * VanillaIceCream, ChocolateIceCream,StrawberryIceCream
 * defines toString with description
 * and getCost
 */
public abstract class IceCream {
	protected String description;
	
	public String toString() {
		return description;
	}
	
	public abstract double getCost();
	
}
