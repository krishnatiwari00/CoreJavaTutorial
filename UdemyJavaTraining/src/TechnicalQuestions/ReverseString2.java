package TechnicalQuestions;

public class ReverseString2 {

	public static void main(String[] args) {
		String name = "Krishna";
		char[] CharArray = name.toCharArray();
		for(int i=CharArray.length-1;i>=0;i--)
		System.out.print(CharArray[i]);
	}

}
