package carrental;

public class Vehicle {
	/*
	 * Write a class Vehicle.
	 * A Vehicle has an instance variable to store the color of the Vehicle.
	 * The color can be retrieved with the getColor() method.
	 * The toString() method returns a String like This vehicle is red, depending on the actual color.
	 */
	
	
	private String color;

	public Vehicle(String color) {
		this.color = color;

	}

	public String getColor() {
		return color;
	}
	
	public String toString() {
		return "This vehicle is " + this.color;
	}
	
	
	
	
	
	
}
