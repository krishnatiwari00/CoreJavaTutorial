package opps;

public class ChildAddition1 extends Addition1 {//method overloading concept, compile time plymorphism 
	
	public static void main(String[] args)
	{
		Addition1 add = new Addition1();
		
		String name = add.addName("Krishna", "Sachin");
		add.addValues(11.25, 34.32);
		add.addValues(50, 40);
		add.addValues(50,40,30);
		System.out.println(name);
	}

}
