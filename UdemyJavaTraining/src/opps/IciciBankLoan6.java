package opps;

public class IciciBankLoan6 extends BankLoan6{

	public static void main(String[] args) {
		 
		BankLoan6 loan = new BankLoan6();
		
		loan.setName("Krishna");
		loan.setAge(35);
		loan.setAmount(10000);
		
		System.out.println("Customer Name is: "+loan.getName());
		System.out.println("Customer age is: "+loan.getAge());
		System.out.println("Loan Amount is: "+loan.getAmount());

	}

}
