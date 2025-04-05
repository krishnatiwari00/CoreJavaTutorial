package CoreJavaUdemy;

public class SecondJavaProgram {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "team";
		
		int a=200;
		int b=300;
		int c = 400;
		
		System.out.println(str1+" "+str2);
		System.out.println(a+b);
		
		System.out.println(a+b+str1+str2);
		System.out.println(str1+str2+a+b);//output:Helloteam200300, because compiler will understand whole statement is string
//nested if else
		if(a>b)
		{
			System.out.println(a+" is greater than "+ b);
		}
		else if(b>c)
		{
			System.out.println(b+"is greater than "+c);
		}
		else
		{
			System.out.println(c+ " is greater than "+b);
		}
		//Switch 
		int day =1;
		switch(day)
		{
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today Wednesday");
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		default:
			System.out.println("Today is Weekend");
		}
		
	}

}
