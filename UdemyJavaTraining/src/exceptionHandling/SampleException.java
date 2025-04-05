package exceptionHandling;

public class SampleException {
	
	public void division()
	{
		try {
			int value = 100;
			int result = value/0;
			System.out.println(result);
			}
			catch(Exception e)
			{
				System.out.println("Please choose another value to divide integer");//this is user define exception
				System.out.println(e);//this will print exception message
				e.printStackTrace();//this will print whole exception
			}
	}
	public void nullpointerException()
	{
		
		String text = null;
		System.out.println(text.length());
	}

	public static void main(String[] args) {
		SampleException sample = new SampleException();
		sample.division();
		sample.nullpointerException();
	}

}
