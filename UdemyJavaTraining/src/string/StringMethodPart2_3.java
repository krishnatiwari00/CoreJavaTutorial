package string;

public class StringMethodPart2_3 {
	public static void main(String args[])
	{
		String text = "TechTraining";
		String text2 = "TechTraining";
		String text3 = "techtraining";
		
		System.out.println(text.equals(text2));//output = true
		System.out.println(text.equals(text3));//output = false because equals method is case sensitive
		System.out.println(text.equalsIgnoreCase(text3));//output = true because equals method is not case sensitive
		
		System.out.println(text.indexOf("h"));//output =3
		System.out.println(text.indexOf("H"));//output = -1 because indexOf method is case sensitive
		
		System.out.println(text.lastIndexOf("T"));//output = 4
		System.out.println(text.lastIndexOf("t"));//output = -1 because this is case sensitive method
		
		System.out.println(text3.length());
	}

}
