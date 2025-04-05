package practice1;

public class InterfaceCar implements Vehicle{

	public static void main(String[] args) {
		
		InterfaceCar car = new InterfaceCar();
		car.start();
		car.stop();//this is default method if you want to change you can implement
		Vehicle.service();//this is static method we can call using interface name
		int speed = Vehicle.MaxSpeed;//this is constant variable we can call using interface name
		
		System.out.println("Vehicle max speed is: "+speed);
	}

	@Override
	public void start() {
		System.out.println("Vehicle Started");
		
	}

}
