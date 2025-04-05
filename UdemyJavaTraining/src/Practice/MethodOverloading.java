package Practice;

public class MethodOverloading {//Mrthod Overloading - if method name is same with different parameters or different data type, it is called static polymorphism or Compile time polymorphism.
	public void addValues(int a, int b)
	{
		int result = a+b;
		System.out.println(result);
	}
	
	public void addValues(double a, double b)
	{
		double result = a+b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		MethodOverloading MO = new MethodOverloading();
		MO.addValues(10,20);
		MO.addValues(20.20, 10.10);
		

	}

}
