package dayFive.staticly;

public class Car {
	String color;
	static int objectCounter = 0;
	
	public Car(String color) {
		super();
		objectCounter++;
		this.color = color;
	}
	
	
}
