package dayThree;

public class Earthling {
	private String color = "white";
	private int age;
	public Earthling(String c, int a) {
		color = c;
		age = a;
	}
	
	public Earthling(){
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color != null) {
			color = color.trim().toLowerCase();
			if(!color.equalsIgnoreCase("white")
					&& !color.equalsIgnoreCase("black")
					&& !color.equalsIgnoreCase("brown")
					&& !color.equalsIgnoreCase("yellow")
					&& !color.equalsIgnoreCase("green")
					&& !color.equalsIgnoreCase("red")) {
				System.out.println("Unsupported color: " + color);
			}
			else {
				System.out.println("Set color to: " + color);
				this.color = color;
			}
		}
		else {
			System.out.println("Color can't be null!");
		}
		
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 150 && age >= 0) {
		System.out.println("All good, set age to: " + age);
		this.age = age;
		}
		else {
			System.out.println("Age should be between 0 and 150. Age: " + age);
		}
		
//	int eat(int initCalories) {
//		int maxCalories = 1000;
//		int remainingCalories = 0;
//		System.out.println("initial calories: " + initCalories);
//		
//		if (initCalories <= maxCalories) {
//			System.out.println("I have eaten calories: " + initCalories);
//		} 
//		else {
//			System.out.println("I have eaten calories: " + maxCalories);
//			remainingCalories = initCalories - maxCalories;
//		}
//		return remainingCalories;
//	}
//	
//	int eat(String vegetableType) {
//		return 22;
//	}
//	
//	double eat() {
//		return 22;
//	}


	}
}
