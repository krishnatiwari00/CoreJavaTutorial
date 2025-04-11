package collectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorSample {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		for(int i=0;i<10;i++)
		{
			al.add(i);
			
		}
		System.out.println("Elements of ArrayList: "+al);
		ListIterator itr = al.listIterator();
		//checking next element availabilty
		while(itr.hasNext())
		{
			//moving cursor to next element
			int i = (Integer)itr.next();//type casting
			
			//getting even elements one by one
			System.out.print(i+" ");
			
			//changing even numbers to odd and 
			//adding modified number again in
			//iterator
			if(i%2==0)
			{
				i++;//even number change to odd
				itr.set(i);//set method to change value
				itr.add(i);//this will add one more even number
			}
		}
		System.out.println();
		System.out.println("Elements after modification "+al);
	}

}
