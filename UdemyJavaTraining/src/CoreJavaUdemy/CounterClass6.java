package CoreJavaUdemy;

public class CounterClass6 {
	int i=0;
	static int j=0;
	
	public CounterClass6()//this is constructor
	{
		i++;
		j++;
		System.out.println("Value of i : "+ i);//i will print always 1 because non static variable is belongs to object and always it is incrementing itself inside the object. 
		System.out.println("Value of j :"+j);//j will print 1,2,3 because static variable it is belongs to class and always it is incrementing itself.
	}
	public static void main(String[] args) {
		
		//System.out.println(CounterClass6.i);- this will throw error because variable i is non static and it is belongs to the class object.
		
		CounterClass6 counter = new CounterClass6();//this is creating memory location in heap memory
		CounterClass6 counter2 = new CounterClass6();
		CounterClass6 counter3 = new CounterClass6();
		System.out.println(counter.i);//accessing non static variable using object reference
		System.out.println(counter2.i);
		
		System.out.println(CounterClass6.j);//this is belongs to class and static members are memory efficient
	}
}
