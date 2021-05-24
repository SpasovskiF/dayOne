package dayFive.homework;

public class Student extends Object{
	static String name;
	static int age;
	static double mathgrade;
	static double chemistrygrade;
	static double average;
	
	
	
	public static void Average() {
		average = (mathgrade + chemistrygrade)/2;
		System.out.println(name + " ima prosek od 2ta predmeta od: " + average);
		System.out.println(name + " isto taka ima " + age + " godini.");
	}
}
