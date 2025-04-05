package exceptionHandling;

public class FinallyBlock {
	//finally block will always execute does not matter try block is executed or not
	//blocks execution order is first try then catch then finally if exception occurred else try and finally will execute

	public static void main(String[] args) {
		try 
		{
			String name = "Krishna";
			System.out.println(name);
			
			String text = null;
			System.out.println(text.length());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Hi my name is Krishna");
		}
		
		
	}

}
