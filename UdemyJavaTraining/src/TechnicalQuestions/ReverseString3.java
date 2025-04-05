package TechnicalQuestions;

public class ReverseString3 {

	public static void main(String[] args) {
		
		String name = "sachin";
		
		StringBuilder stringbuilder= new StringBuilder(name);
		String reverse = stringbuilder.reverse().toString();
		
		System.out.println("Original String : "+name);
		System.out.println("Reversed String: "+reverse);

	}

}
