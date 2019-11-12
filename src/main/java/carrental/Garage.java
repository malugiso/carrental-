package carrental;

/* Write a class Garage that has a Vehicle as an instance variable.
 * This garage can be used by Cars and Trucks.
 * Define a method setVehicle(Vehicle parked) to park a vehicle in the garage.
 * Provide a method toString() to print a message Description of the parked vehicle ... 
 * followed by the description vehicle that is in the garage at this moment.
 */
public class Garage {
	
	private Vehicle parked;

	public void setVehicle(Vehicle parked){
		this.parked = parked;		
	}
	
	public String toString() {
		return "Description of the parked vehicle: " + parked.toString();
	}
	

}
