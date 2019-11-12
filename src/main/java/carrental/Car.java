package carrental;

public class Car extends Vehicle{
	
	/*Write a class Car that extends the class Vehicle.
	A car has an instance variable of type boolean to define whether it has winter tires or not (default value: false).
	
	The method toString() of the class Car prints the same message as the method of the class Vehicle, but it does also add another line with the content:
	has winter tires: true/false, depending on the actual value.*/
	private boolean winterTires;
	
	//public Car(boolean winterTires) {
		//	this.winterTires = winterTires;
	//}
	
	public Car(String color, boolean winterTires) {
		super(color);
		this.winterTires = winterTires;
	}
	
	public Car(String color) {
		this(color, false);
	}

	public String toString() {
		return super.toString() + ", has WinterTires: " + this.winterTires;
	}
}
