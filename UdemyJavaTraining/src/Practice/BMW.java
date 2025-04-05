package Practice;

public class BMW extends Car{//this is single level inheritance because BMW class is inheriting car class
	static String name = "Car name is BMW";

	public static void main(String[] args) {
		System.out.println(name);
		Car car = new Car();
		car.run();

	}

}
