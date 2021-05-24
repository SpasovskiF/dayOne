package dayFive;

public class Building {

	private int numOfApartments;
	private int numberOfRentedApartments;  // polinja
	
	/**
	 * 
	 * @param numOfApartments -> min value 10, max value 20. If less then 10, value is set to 10.
	 * @param numberOfRentedApartments -> min 0, max total number of apartments
	 */
	public Building(int numOfApartments, int numberOfRentedApartments) {  // konstruktor
		super();
		if(numOfApartments <= 10) {
			this.numOfApartments = 10;
		}
		this.numOfApartments = numOfApartments;
		this.numberOfRentedApartments = numberOfRentedApartments;
	}
	/**
	 * It accepts no arguments
	 * @return true if there is no apartments avilible, false otherwise
	 */
	public boolean areAllApartmentsOcupied() {			// metoda
		if(numOfApartments == numberOfRentedApartments) {
			return true;
		}
		else {
			return false;			
		}
	}

	public int getNumOfApartments() {
		return numOfApartments;
	}

//	public void setNumOfApartments(int numOfApartments) {
//		this.numOfApartments = numOfApartments;
//	}
	
	public int getNumberOfRentedApartments() {
		return numberOfRentedApartments;
	}

//	public void setNumberOfRentedApartments(int numberOfRentedApartments) {
//		this.numberOfRentedApartments = numberOfRentedApartments;
//	}
	
	
	
}
