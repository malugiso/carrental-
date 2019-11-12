package carrental;

/*
 * Write a class Truck that extends the class Vehicle.
 * A truck has an instance variable of type boolean to define whether it has a trailer or not (default value: false).
 * The method toString() of the class Truck prints the same message as the method of the class Vehicle, but it does also add another line with the content:
 * has trailer: true/false, depending on the actual value.
 */


public class Truck extends Vehicle {
	
	private boolean trailer;
	
	public Truck(String color, boolean trailer) {
		super(color);
		this.trailer = trailer;
	} 
	
	public Truck(String color) {
		this(color, false);
	}
	
	public String toString() {
		return super.toString() + ", has Trailer: " + trailer;
	}

}
