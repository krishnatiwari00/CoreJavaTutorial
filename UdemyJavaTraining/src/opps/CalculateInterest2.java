package opps;

public class CalculateInterest2 {

	public static void main(String[] args) {//method overriding or run time polymorphism or dynamic polymorphism
		
		BankOfAmerica2 BA = new BankOfAmerica2();
		AmericanExpress2 AE = new AmericanExpress2();
		IciciBank2 icici = new IciciBank2();
		
		System.out.println(BA.getInterest());
		System.out.println(AE.getInterest());
		System.out.println(icici.getInterest());

	}
	/*
	 * Same Method Signature: The method in the subclass must have the same name,
	 * return type, and parameters as the method in the superclass.
	 * 
	 * Access Modifier: The access modifier of the overridden method cannot be more
	 * restrictive than the method in the superclass. For example, if the superclass
	 * method is public, the subclass method cannot be protected or private.
	 * 
	 * Return Type: The return type of the overridden method must be the same or a
	 * subtype (covariant return type) of the return type declared in the superclass
	 * method.
	 * 
	 * Exception Handling: The overridden method can throw the same exceptions or
	 * subclasses of those exceptions declared in the superclass method. It cannot
	 * throw broader exceptions.
	 * 
	 * Invocation: To call the superclass method from the subclass, you can use the
	 * super keyword.
	 * 
	 * Static Methods: Static methods cannot be overridden. If a static method is
	 * redefined in a subclass, it is considered method hiding.
	 * 
	 * Final Methods: Methods declared as final in the superclass cannot be
	 * overridden.
	 * 
	 * Constructors: Constructors cannot be overridden.
	 */

}
