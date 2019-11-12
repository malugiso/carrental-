package carrental;

/* 
 * Write a class CarRental that contains an array of CarRentalContracts.
 * This array contains all the currently issued contracts.
 * The CarRental class provides a method to add new contracts 
 * (void addContract(CarRentalContract c1)) to the array and a method 
 * (String displayContracts()) that returns all the current rental contracts 
 * (by using the toString() method of the CarRentalContract class), each contract on a new line.
 */

public class CarRental {
	private static int crcValue = 0;
	private CarRentalContract[] crc = new CarRentalContract[1000];
	
	public void addContract(CarRentalContract c1) {
		if (crc.length > 1000) {
			System.out.println("too much CarRentalContracts");
		}
		crc[crcValue] = c1;
		crcValue ++;
	}
	
	public String displayContracts() {
		
		String tmp = "";
		for (CarRentalContract carRentalContract : crc) {
			tmp += carRentalContract.toString() + "\n";
		}
		return tmp;
	}

	
}
