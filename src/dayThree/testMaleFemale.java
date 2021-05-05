package dayThree;

public class testMaleFemale {
	
	public static void main(String[] args) {
		Male male1 = new Male("brown", 191);
		Female female1 = new Female("blonde", 170);
		System.out.println(male1.getHairColor());
		System.out.println(male1.getHeight());
		System.out.println(female1.getHairColor());
		System.out.println(female1.getHeight());
		
		male1.setHairColor("white");
		male1.setHairColor("Orange");
		male1.setHairColor("basketball");
		male1.setHairColor(" white");
		male1.setHairColor("white ");
		male1.setHairColor("wHiTe");
		male1.setHairColor(null);
		
		female1.setHairColor("white");
		female1.setHairColor("Orange");
		female1.setHairColor("basketball");
		female1.setHairColor(" white");
		female1.setHairColor("white ");
		female1.setHairColor("wHiTe");
		female1.setHairColor(null);
		
		male1.setHeight(-1);
		male1.setHeight(20);
		male1.setHeight(190);
		male1.setHeight(270);
		
		female1.setHeight(-1);
		female1.setHeight(20);
		female1.setHeight(175);
		female1.setHeight(250);
	}
}
