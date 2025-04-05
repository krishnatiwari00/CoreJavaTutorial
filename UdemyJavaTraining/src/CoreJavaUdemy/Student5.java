package CoreJavaUdemy;

public class Student5 {
	/*
	 * Constructor name must be the same as its class name A Constructor must have
	 * no explicit return type A Java constructor cannot be abstract, static, final we can not create duplicate constructor
	 */
	public Student5()//this is default constructor
	{
		System.out.println("Hi i am inside Constructor");
	}
	
	int rollnumber;
	String name;
	
	public Student5(int i, String n)//this is parameterized constructor
	{
		rollnumber =i;
		name = n;
	}
	//constructor overloading = constructor with different parameters are called constructor overloading
	
	public void Display()
	{
		System.out.println("Roll Number is: "+rollnumber+" and Name is: "+name);
	}

	public static void main(String[] args) {
		Student5 std = new Student5();//this will call default constructor
		Student5 std1 = new Student5(10,"Krishna");//this will call parameterized constructor
		Student5 std2 = new Student5(20,"Tiwari");

		std1.Display();//calling display method
		std2.Display();
	}

}
