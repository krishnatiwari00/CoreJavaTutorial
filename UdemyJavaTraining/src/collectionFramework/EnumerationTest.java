package collectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		//create a vector and print it contents
		Vector v = new Vector();
		for(int i=0;i<10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		
		//at beginning e(cursor) will point to
		//index just befor the first element in v
		Enumeration e = v.elements();
		
		//checking the next element availability
		while(e.hasMoreElements()) 
		{
			int i=(Integer) e.nextElement();
			
			System.out.print(i + " ");
		}
	}

}
