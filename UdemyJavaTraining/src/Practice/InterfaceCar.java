package Practice;

public class InterfaceCar implements Vehicle{// multiple level inheritance using interface

	@Override
	public void start() {//this method need to implement because it is declared in Vehicle interface
		System.out.println("Vehicle started");
	} 
	// The stop() method is inherited from the Vehicle interface
    // No need to override it unless you want to provide a different implementation

    // The service() method can be called using the interface name
    // Vehicle.service();
	
	public static void main (String [] args)
	{
		//no need to implement stop method because it is default method if you want to change implementation you can override stop method
		InterfaceCar car = new InterfaceCar();
		car.start();
		car.stop();
		Vehicle.service();
		System.out.println("Max speed of Vehicle is: "+Vehicle.MAX_SPEED);
	}
	/*
	 * 1-The Car class implements the Vehicle interface and provides an implementation
	 * for the start() method, 2-The stop() method from the Vehicle interface is used
	 * as is, without overriding, 3-The service() method is called using the interface
	 * name Vehicle,4- The constant MAX_SPEED is accessed using the interface name
	 * Vehicle.
	 */
	/*
	 * In Java, an interface is a blueprint of a class. It is a collection of
	 * abstract methods and constants. When a class implements an interface, it must
	 * provide concrete implementations for all the abstract methods defined in the
	 * interface. Interfaces are used to achieve abstraction and multiple
	 * inheritance in Java.
	 * 
	 * Here's a more detailed definition:
	 * 
	 * Abstract Methods: Methods that are declared without an implementation
	 * (without braces, and followed by a semicolon). Constants: Variables declared
	 * in an interface are implicitly public, static, and final. Default Methods:
	 * Methods with a default implementation, introduced in Java 8. Static Methods:
	 * Methods that belong to the interface itself, introduced in Java 8.
	 */
}
