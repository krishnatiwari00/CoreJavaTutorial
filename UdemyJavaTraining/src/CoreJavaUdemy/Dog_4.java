package CoreJavaUdemy;

public class Dog_4 {
	//in class state define by variables
	String Name = "Jacky";
	String Breed = "Bull Dog";
	int Height = 4;
	
	//in class behavior define by Methods
	public void barking()
	{
		System.out.println(Name+" is Barking");
	}
	
	public void eating()
	{
		System.out.println(Name+" is Eating");
	}

	public static void main(String[] args) {
		
		//we can create multiple objects for same class
		Dog_4 obj = new Dog_4();
		Dog_4 obj1=new Dog_4();
		
		System.out.println(obj.Height);
		System.out.println(obj1.Breed);
		obj.barking();
		obj1.eating();

	}

}
