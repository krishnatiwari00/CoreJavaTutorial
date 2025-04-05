package array;

public class TestArray {//Array : Array is a collection of similar type of elements.
	/*
	 * An array is a data structure that consists of a collection of elements, each
	 * identified by an index or key. Here are some key points about arrays:
	 * 
	 * Homogeneous Elements: All elements in an array are of the same type. Fixed
	 * Size: The size of an array is determined at the time of its creation and
	 * cannot be changed. Indexed Access: Elements can be accessed directly using
	 * their index, which starts from 0 in most programming languages. Contiguous
	 * Memory Allocation: Elements are stored in contiguous memory locations, which
	 * allows for efficient access and manipulation.
	 */
	public static void main(String[] args) {
		int arrayone[] = new int [10];
		arrayone[0]=10;
		arrayone[1]=20;
		arrayone[3]=30;
		arrayone[4]=40;
		arrayone[5]=50;
		arrayone[6]=60;
		arrayone[7]=70;
		
		System.out.println("First array size is "+arrayone.length);
		System.out.println("4th value of first array is "+arrayone[4]);
		//to print all elements from array
		for (int i=0;i<arrayone.length;i++)
		{
			System.out.println(arrayone[i]);
		}
int arraysecond[] = {90,80,70,60,50,40,30,20};//this is another way to define array

System.out.println("Second array size is "+ arraysecond.length);
System.out.println("2nd value of second array is: "+arraysecond[2]);
//to print all elements from second array
for(int i=0;i<arraysecond.length;i++)
{
System.out.println(arraysecond[i]);
}
}

}
