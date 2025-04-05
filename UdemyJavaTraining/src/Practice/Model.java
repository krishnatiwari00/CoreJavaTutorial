package Practice;

public class Model extends BMW{//this is multilevel inheritance because Model class inheriting 
	//BMW class and BMW class inheriting Car class
static String model = "X3";
	public static void main(String[] args) {
		BMW bmw = new BMW();
		
		System.out.println(name);
		bmw.run();
		System.out.println("Car Model is: "+model);

	}

}
