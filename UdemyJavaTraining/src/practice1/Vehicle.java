package practice1;

public interface Vehicle {
	/*
	 * Interface- interface is used to achieve 100% Abstraction in java, in
	 * interface only abstract methods are allowed, All variables declared in
	 * interface should be constant like - public static final, you can't create
	 * object of the interface, An interface is declared by using Interface keyword,
	 * interface can extends another interface, class can implements interface,
	 * using interface we can perform multiple inheritance in java, we can declare
	 * default method also java 8 and above, we can call default method in class using interface name,
	 */	
	
//abstract method
public void start();

//default method
default void stop()
{
System.out.println("Vehicle stoped");
}

//static method
public static void service()
{
System.out.println("Vehicle serviced");
}

//constant variable
int MaxSpeed = 120;
}
