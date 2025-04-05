package opps;

public class Model extends BMW {//multilevel inheritance
static String model = "X3";
	public static void main(String[] args) {
		BMW bmw = new BMW();
		
		System.out.println("Model is: "+model);
		System.out.println("Car name is: "+name);
		
		System.out.print("Behaviour of car: ");
		bmw.run();// using object reference variable i am able to access car class run method

	}

}
