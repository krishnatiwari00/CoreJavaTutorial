package Practice;

public interface Vehicle1 {
	
	public void Start();
	
	default void Stop()
	{
		System.out.println("Vehicle stopped");
	}
	public static void Service()
	{
		System.out.println("Vehicle serviced");
	}
	
	int maxspeed=120;

}
