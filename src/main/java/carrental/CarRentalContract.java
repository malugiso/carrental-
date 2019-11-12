package carrental;

public class CarRentalContract {
	private Vehicle vehicle;
	private Customer customer;
	
	
	public CarRentalContract(Customer customer, Vehicle vehicle) {
		this.vehicle = vehicle;
		this.customer = customer;
	}
	
	public String toString() {
		return this.customer.name + ":" + this.vehicle.toString();
	}
	
	
}
