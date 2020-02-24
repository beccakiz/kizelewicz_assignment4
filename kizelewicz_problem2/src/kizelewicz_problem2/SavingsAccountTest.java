package kizelewicz_problem2;

public class SavingsAccountTest {

	public static void main(String[] args)
	{
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		SavingsAccount.modifyInterestRate(.04);
		
		System.out.println("saver1 monthly balance: " + saver1.calculateMonthlyInterest());
		System.out.println("saver2 monthly balance: " + saver2.calculateMonthlyInterest());
		
		SavingsAccount.modifyInterestRate(.05);
		System.out.println("saver1 monthly balance: " + saver1.calculateMonthlyInterest());
		System.out.println("saver2 monthly balance: " + saver2.calculateMonthlyInterest());
		
	}
}
