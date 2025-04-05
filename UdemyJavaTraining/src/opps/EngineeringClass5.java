package opps;

public class EngineeringClass5 implements Student5  {

	public static void main(String[] args) {
		
		EngineeringClass5 eng = new EngineeringClass5();
		MedicalClass5 med = new MedicalClass5();
		
		eng.displayName();
		eng.getStandard();
		eng.getUniversity();
		eng.getStudentNumber();
		
		med.displayName();
		med.getStandard();
		med.getStudentNumber();
		med.getUniversity();
	}

	@Override
	public void displayName() {
		System.out.println("Hi , We are from Engineering");
		
	}

	@Override
	public void getStudentNumber() {
		System.out.println("We are 120 students");
		
	}

	@Override
	public void getStandard() {
		System.out.println("We are from Computer Science");
		
	}
public void getUniversity()
{
System.out.println("University name is: "+Student5.university);	
}

@Override
public void getInterfaceName() {
	// TODO Auto-generated method stub
	
}
}
