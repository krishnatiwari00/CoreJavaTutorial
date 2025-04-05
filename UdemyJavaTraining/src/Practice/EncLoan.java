package Practice;

public class EncLoan {//Encapsulation binding data and code together using getter and setter.
	private String name;
	private int age;
	private int amount;

	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAge(int age)
	{
		if(age>=18 && age<60)
		{
			this.age=age;
		}
		else 
		{
		System.out.println(name+" you are not eligible for loan because your age is not matching within criteria");
		}
	}
	
	public void setAmount(int amount)
	{
		if(amount>=1000 && amount<1000000)
		{
			this.amount=amount;
		}
		else
		{
			System.out.println(name+" sorry you are not eligible for loan amount : "+amount);
		}
	}
	//above code is example of setter
	
	//below code is example of getter
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int getAmount()
	{
		return amount;
	}
}
