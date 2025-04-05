package CoreJavaUdemy;

public class FirstJavaProgram {
	static int varSec = 678;//this is Instance or class variable this we can access in all methods in the same class
	public static void firstMethod()
	{
		int number = 12345; //Local Variable
		String city = "Newyork";//Local Variable
		
		System.out.println(number);
		System.out.println(city);
	}

	public static void main(String[] args) {
		System.out.println("This is my first programm");
		FirstJavaProgram.firstMethod();
	}

}
