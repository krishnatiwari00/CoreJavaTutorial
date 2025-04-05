package practice1;

public class EncParent {
	/*
	 * Encapsulation - Binding code and data together is called encapsulation,we can perform encapsulation using
	 * private non static data members with public non static getter and setter
	 * methods
	 */
	
private String Name;
private int Age;
//below code is example of setter
public void setName(String Name)
{
this.Name = Name;
}
public void setAge(int Age)
{
	if(Age>0)
	{
		this.Age=Age;
	}
	else
	{
	System.out.println("Please enter valid age: ");	
	}

}
//below code is example of getter
public String getName()
{
	return Name;
}
public int getAge()
{
return Age;
}
}
