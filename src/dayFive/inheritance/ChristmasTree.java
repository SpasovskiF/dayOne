package dayFive.inheritance;

public class ChristmasTree extends Tree {
	boolean isDecorated = false;

	public ChristmasTree(boolean isDecorated) {
		super();
		this.height = 55;
		this.isDecorated = isDecorated;
	}
	
	@Override
	public String grow(int cm) {
		this.height = height + (2 * cm);
		return "I have grown " + (2 * cm) + " centimeters." + "Now I am: " + height;
	}
	
	@Override
	public String toString() {
		return "I am a christmas tree.";
	}
}
