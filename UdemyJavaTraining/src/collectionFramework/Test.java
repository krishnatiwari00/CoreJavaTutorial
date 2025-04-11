package collectionFramework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Test {
	public static String encryptStr(TreeSet<Character> T)
	  {

	    //this is default OUTPUT. You can change it.
	    String result = "";

	    //write your Logic here:
	    Map<Character, String> uniqueCodeMap = new HashMap<>();

	    for(Character ch:T)
	    {
	      result +=ch;
	    }


	      return result;
	  }
	  public static void main (String[]args) throws IOException
	  {

	    //INPUT [uncomment & modify if required]
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	    String S = br.readLine().trim();
	    TreeSet<Character> T = new TreeSet<Character>();
	    for(int i=0;i<S.length();i++)
	    {
	        T.add(S.charAt(i));
	    }

	    //OUTPUT [uncomment & modify if required]
	    System.out.print(encryptStr(T));
	  }

}
