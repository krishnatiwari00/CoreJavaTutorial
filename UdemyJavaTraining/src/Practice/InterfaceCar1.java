package Practice;

public class InterfaceCar1 implements Vehicle1{

	public static void main(String[] args) {
		InterfaceCar1 car = new InterfaceCar1();
		car.Start();//this method implemented in this class(InterfaceCar1)
		car.Stop();//this is default method so no need to implement
		Vehicle1.Service();//this is static method we can call using interface name
		int speed = Vehicle1.maxspeed;//this is constant variable we can access using interface name
		System.out.println("Max speed of vehicle is: "+speed);
	}

	@Override
	public void Start() {
		System.out.println("Vehicle started");
	}

}
