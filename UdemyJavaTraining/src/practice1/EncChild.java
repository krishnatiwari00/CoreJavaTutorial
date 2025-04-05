package practice1;

public class EncChild extends EncParent{

	public static void main(String[] args) {
		EncChild child = new EncChild();
		child.setAge(23);
		child.setName("Krishna");
		System.out.println("Name is: "+child.getName());
		System.out.println("Age is: "+child.getAge());

	}

}
