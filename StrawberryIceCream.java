/**
 * @author Luis
 * 
 * inherits from Ice Cream class
 * and adds a description to the ice cream
 * object as well as its original cost 
 */
public class StrawberryIceCream extends IceCream{
	
	public StrawberryIceCream() {
		this.description = "Strawberry Ice Cream";
	}
	
	public double getCost() {
		return 0.8;
	}

}
