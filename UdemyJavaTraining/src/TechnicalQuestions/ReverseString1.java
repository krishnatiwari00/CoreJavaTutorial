package TechnicalQuestions;

public class ReverseString1 {

	public static void main(String[] args) {
		String name = "Krishna";
		String reversed = "";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			reversed += name.charAt(i);
		}
			System.out.println(reversed);
	}

}
