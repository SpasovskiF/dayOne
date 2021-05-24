package dayFive;

public class TestScope {
	
	int counter = 22; //instansna promenliva, moze da se primitivni
	
	static int objectCounter; //klasna promenliva postoi samo vo klasata
	
	public static void main(String[] args) {
		int counter = 22; //localna promenliva definirana vo metoda
		System.out.println(counter);
	}

}
