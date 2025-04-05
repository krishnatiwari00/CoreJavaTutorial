package CoreJavaUdemy;
//This is 3rd lecture

public class Loops_3 {
	public static void main(String[] args) {
		
//for loop
		for(int i=0;i<10;i++)
		{
			System.out.println("this is for loop "+i);
		}
		
//while loop
		int j=10;
		while(j>1)
		{
			System.out.println("this is while loop "+j);
			j--;
		}
//do-while - this will execute once if condition not met
		int k=0;
		do
		{
			System.out.println("this is do while loop "+k);
		}
		while(k>0);
		
	}

}
