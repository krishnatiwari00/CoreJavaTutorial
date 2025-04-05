package TechnicalQuestions;

public class ReverseString4 {

	public static void main(String[] args) {
		String name = "Krishna";
		
		StringBuffer stringbuffer = new StringBuffer(name);
		String Reversed = stringbuffer.reverse().toString();
		
		System.out.println("Original String: "+name);
		System.out.println("Reversed String: "+Reversed);

	}

}
