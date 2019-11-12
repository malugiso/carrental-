/*
 * Project and Training 1 - HS19/20 (Java), Computer Science, Berner Fachhochschule
 */

package carrental;

public class GarageTester {
	
	public static Garage getExample() {
		Truck exTruck = new Truck("black", false);
		Garage g = new Garage();
		g.setVehicle(exTruck);
		return g;
	}
	
	public static void main(String[] args) {
		Garage g = getExample(); 
	}

}
