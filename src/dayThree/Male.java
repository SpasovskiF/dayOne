package dayThree;

public class Male {
	
	private String hairColor;
	private int height;
	
	public Male(String hc, int h) {
		hairColor = hc;
		height = h;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		if (hairColor != null) {
			hairColor = hairColor.trim().toLowerCase();
			if(!hairColor.equalsIgnoreCase("white")
					&& !hairColor.equalsIgnoreCase("black")
					&& !hairColor.equalsIgnoreCase("brown")
					&& !hairColor.equalsIgnoreCase("blonde")
					&& !hairColor.equalsIgnoreCase("orange")
					&& !hairColor.equalsIgnoreCase("red")
					&& !hairColor.equalsIgnoreCase("grey")) {
				System.out.println("Wrong or not natural hair color: " + hairColor);
			}
			else {
				System.out.println("Hair color set to: " + hairColor);
				this.hairColor = hairColor;
			}
		}
		else {
			System.out.println("Hair color can't be null!");
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if(height>=20 && height<=240) {
			System.out.println("Set height to: "+ height);
			this.height = height;
		}
		else {
			System.out.println("Height should be around 20 to 220, unless you are a giant or a goblin");
		}
	}
}
