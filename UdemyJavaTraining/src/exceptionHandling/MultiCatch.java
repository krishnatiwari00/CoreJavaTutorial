package exceptionHandling;

public class MultiCatch {

	public static void main(String[] args) {//always we should have most specific to most generic catch block this is rule for try catch block
		//at a time one one exception will throw
		//after generic or default catch block we can not write specific exception block 
		try
		{
		int value = 100;
		int result = value/0;
		}
		catch(ArithmeticException e)//this is most specific
		{
			System.out.println(e);
		}
		catch(Exception e)//this is most generic
		{
			System.out.println(e);
		}
		/*
		 * catch(ArithmeticException e)//this will throw compile time exception {
		 * 
		 * }
		 */
	}

}
