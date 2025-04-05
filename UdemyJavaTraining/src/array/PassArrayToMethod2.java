package array;

public class PassArrayToMethod2 {
	public void findMin(int arrayone[])//finding minimum value in list of digits- and passing array in the method
	{
		int min = arrayone[0];
		
		for(int i=1;i<arrayone.length;i++)
		{
			if(min>arrayone[i])
			{
				min = arrayone[i];
			}
		}
		System.out.println("Minimum value in list is: "+min);
	}

	public int[] getArray()//this method will return array
	{
		return new int[] {9,6,5,4,3,2};
	}
	public static void main(String[] args) {
		int testArray[] = {10,7,8,1,5,9,7};
		PassArrayToMethod2 pass = new PassArrayToMethod2();
		pass.findMin(testArray);//passting array to method
		
		int secondArray[] = pass.getArray();
		System.out.println("2nd element under second array is: "+secondArray[2]);
	}
}
