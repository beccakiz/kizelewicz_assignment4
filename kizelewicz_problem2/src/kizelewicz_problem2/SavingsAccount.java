package kizelewicz_problem2;

public class SavingsAccount {

	private static double annualInterestRate; 
	private double savingsBalance = 0.0;
	
	public SavingsAccount(double num) {
			savingsBalance = num;
	}

	public double calculateMonthlyInterest()
	{
		double interest = 0.0;
		interest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance = savingsBalance + interest;
		return savingsBalance;
	}
	
	public static void modifyInterestRate(double rates)
	{
		annualInterestRate = rates;
	}
}
