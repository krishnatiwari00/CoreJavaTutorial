package string;

public class StringMethodPart1_2 {

	public static void main(String[] args) {
		String test = "Learning is the Key";
		
		char ch = test.charAt(12);
		System.out.println("CharAt method use: "+ch);
		
		String test2 = test.concat("to success").concat("and learning java");
		System.out.println("this is use of concat method : "+test2);
		
		System.out.println("this is use of concat method : "+test.contains("Key"));//this will case sensitive, output=true
		System.out.println("this is use of concat method : "+test.contains("Y"));//output=false
		
		System.out.println("this is use of Endswith method : "+test.endsWith("Key"));//output= false becasue this method is case sensetive
		System.out.println("this is use of Endswith method : "+test.endsWith("Y"));//output = false because this method is case sensetive

	}

}
