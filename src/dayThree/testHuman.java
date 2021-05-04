package dayThree;

public class testHuman {

	public static void main(String[] args) {
		Earthling earthling1 = new Earthling("yellow", 25);
		System.out.println(earthling1.getColor());
		System.out.println(earthling1.getAge());
		earthling1.setAge(256);
		System.out.println(earthling1.getAge());
		
		earthling1.setAge(-1);
		earthling1.setAge(260);
		earthling1.setAge(110);
		
		earthling1.setColor("White");
		earthling1.setColor("Orange");
		earthling1.setColor("WhItE");
		earthling1.setColor("football");
		earthling1.setColor("white ");
		earthling1.setColor(" white");
		
		earthling1.setColor(null);
		
//		int result1;
//		int result2;
//		System.out.println(earthling1.age);
//		System.out.println(earthling1.color);
//		System.out.println(earthling1);
//		
//		
//		result1 = earthling1.eat(680);
//		System.out.println(result1);
//		result2 = earthling1.eat(1050);
//		System.out.println(result2);
//		
//		int result3 = earthling1.eat(345);
//		int result4 = earthling1.eat("");
//		double result5 = earthling1.eat();
	}
}
