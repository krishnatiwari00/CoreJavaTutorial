package opps;

public class Addition1 {//method overloading concept
	public void addValues(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	
	public void addValues(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println(d);
	}
	
	public void addValues(double a, double b)
	{
		double c = a+b;
		System.out.println(c);
	}
	
	public String addName(String a, String b)
	{
		String c = a+b;
		return c;
	}

}
