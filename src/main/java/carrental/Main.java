package carrental;

public class Main {

	public static void main(String[] args) {
		
		Vehicle bmw = new Vehicle("blue");
		System.out.println(bmw);
		System.out.println(bmw.getColor());
		
		Car audi = new Car("red", true);
		System.out.println(audi);

		Truck jeep = new Truck("yellow", true); 
		System.out.println(jeep);
		
		Garage garage = new Garage();
		garage.setVehicle(audi);
		System.out.println(garage.toString());
		
		Customer polo = new Customer("polo", "Büschi");
		System.out.println(polo);
		
		CarRentalContract cr = new CarRentalContract(polo, audi);
		System.out.println(cr);
		

	}

}
