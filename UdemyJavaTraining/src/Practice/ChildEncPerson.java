package Practice;

public class ChildEncPerson extends EncPerson{

	public static void main(String[] args) {
		
		ChildEncPerson person = new ChildEncPerson();
		person.setAge(8);
		person.setName("Krishna");
		System.out.println("Person age is: "+person.getAge());
		System.out.println("Person name is: "+person.getName());

	}

}
