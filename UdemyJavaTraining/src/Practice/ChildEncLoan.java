package Practice;

public class ChildEncLoan {

	public static void main(String[] args) {
		EncLoan loan = new EncLoan();
		loan.setName("Krishna");
		loan.setAge(59);
		loan.setAmount(1000);
		
		System.out.println("Consumer name is: "+loan.getName());
		System.out.println("Consumer age is: "+loan.getAge());
		System.out.println("Sancioned Loan amount is: "+loan.getAmount());

	}

}
