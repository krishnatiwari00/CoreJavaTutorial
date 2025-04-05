package CoreJavaUdemy;

public class StudentDemo7 {
	int rollnumber;//intance variable or class variable or gloabal variable we can call.
	String name;
	String standard;
	
	
	/*//this is without this keyword constructor
	 * public StudentDemo7(int i, String n, String s) { rollnumber = i; name = n;
	 * standard = s; }
	 */
	
	public StudentDemo7(int rollnumber , String name, String standard)
	{
		//rollnumber = rollnumber;- this will show warning that is why we need to use this keyword for class variable. 
		this.rollnumber = rollnumber;
		this.name = name;
		this.standard = standard;
	 }
	public void display()
	{
		System.out.println("Student rollnumber is: "+rollnumber+" name is: "+name+" and in class: "+standard);
	}

	public static void main(String[] args) {
		StudentDemo7 std = new StudentDemo7(10,"Frank","2nd");
		StudentDemo7 std1 = new StudentDemo7(20,"Michael","5th");
		std.display();
		std1.display();
	}

}
