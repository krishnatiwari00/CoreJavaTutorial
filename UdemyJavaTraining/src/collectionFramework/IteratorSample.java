package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		for(int i=0;i<10;i++)
		{
			al.add(i);
		}
		System.out.println("Elements of ArrayList: "+al);
		
		System.out.println("Starting Iterator");
		Iterator itr = al.iterator();
		//checking the next element availablity 
		while(itr.hasNext())
		{
			//moving cursor to next element
			int i=(Integer)itr.next();//using type casting
			System.out.print(i+ " ");
			
			if(i%2!=0)
			{
				itr.remove();
			}
		}
		System.out.println();
		System.out.println("Elements after remove operation :"+al);
	}

}
