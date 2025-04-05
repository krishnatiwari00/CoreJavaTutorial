package opps;

public class BMW extends Car {//single level inheritance
	static String name = "BMW"; 

	public static void main(String[] args) {
		Car car = new Car();
		System.out.print(name);
		car.run();

	}

}
