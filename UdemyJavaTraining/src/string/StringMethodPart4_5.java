package string;

public class StringMethodPart4_5 {

	public static void main(String[] args) {
		String text = "United State";
		
		System.out.println(text.substring(5));//output = d State
		System.out.println(text.substring(2, 9));//output = ited St
		
		System.out.println(text);
		char[] chararray = text.toCharArray();
		for(int i=0;i<chararray.length;i++)
		{
			System.out.println(chararray[i]);
		}
		
		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());
		
		String text1 = "Krishna          ";
		String text2 = "            Tiwari";
		System.out.println(text1.trim()+text2.trim());
	}

}
