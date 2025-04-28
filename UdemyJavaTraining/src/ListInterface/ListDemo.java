package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		//list is ordered collection of object we can store duplicate values as well as
		
		List l1 = new ArrayList();
		l1.add(0,12);//this method add given element at specific index.
		l1.add(1,14);
		
		List l2 = new ArrayList();
		l2.add(10);
		l2.add(11);
		l2.add(132);
		l2.add(165);
		l2.add(187);
		
		l1.addAll(1, l2);//this method add all elements from specified collection to list. First element gets inserted at given index.
		
		l1.remove(3);//this method remove given element at specific index.
		System.out.println(l1);
		
		System.out.println("Index present at 5th Index : "+l1.get(5));
		
		l1.set(5, 122);
		System.out.println("After Set Operation : "+l1);
		
		l2.add(l2);
		l2.add(10);
		
		//indexOf - this will return first occurrence of given index if element not present it will return -1
		System.out.println(l1.indexOf(10));
		//lastIndexOf - this will return last occurrence of given index if element not present it will return -1
		System.out.println(l1.lastIndexOf(187));
		
		List l3 = new ArrayList();
		l3 = l1.subList(3, 5);
		System.out.println("Partial list "+l3);
				
	}

}
