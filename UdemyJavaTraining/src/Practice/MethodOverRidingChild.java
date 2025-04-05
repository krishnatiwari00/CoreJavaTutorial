package Practice;

public class MethodOverRidingChild{
	public void Sum()
	{
		int a=50, b=60;
		int result = a+b;
		System.out.println("Overridden method sum is: "+result);
	}

	public static void main(String[] args) {
		MethodOverRiding parent = new MethodOverRiding();
		parent.Sum();//this is calling parent class method
		MethodOverRidingChild child = new MethodOverRidingChild();
		child.Sum();//this is calling overridden method
		

	}

}
