package opps;

public interface Student5 extends StudentParent5{//this is interface, interface can extends interface
	
	public static final String university = "University of New York";
	
	/*
	 * JAVA: Interface in Java 1-Interface : Interface is used to achieve the 100%
	 * Abstraction in Java. In interface, only abstract methods are allowed. 2-All
	 * variables declared in Interface should be Constant. i.e public static final
	 * 3- You can’t create the Object of Interface. 4- An interface is declared by
	 * using the interface keyword. 5- Interface can extend the another Interface.
	 * 6- Class can implement the interface.
	 */
	public void displayName();
	
	public void getStudentNumber();
	
	public void getStandard();

}
