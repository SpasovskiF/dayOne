package dayFive.inheritance;

public class Tree {
	String type = "winter green";
	int height = 100;
	
	public String grow(int cm) {
		int initialGrowth = 11;
		this.height = height + cm;
		return "I have grown " + cm + " centimeters." + "Now I am: " + height;
	}
	
	public Tree() {
		super();
	}
}
