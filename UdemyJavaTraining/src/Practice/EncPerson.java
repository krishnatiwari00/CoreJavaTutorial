package Practice;

public class EncPerson {//encapsulation: binding code and data together with private non static data members with public non static methods like getter and setter
	private String name;
	private int age;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		if(age>0)
		{
			this.age=age;	
		}
		else
		{
			System.out.println("Please enter positive age : ");
		}
	}
}
