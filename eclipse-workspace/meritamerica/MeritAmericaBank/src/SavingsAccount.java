public class SavingsAccount {
	private double savingsAccountopeningbalance;
	private double intrestRate = .001;
	private int years = 3;
	
	public SavingsAccount( double savingsAccountopeningbalance) {
		this.savingsAccountopeningbalance = savingsAccountopeningbalance;
		
		}
	double getbalance() {
		return savingsAccountopeningbalance;

	}
	double getintrestRate() {
		return intrestRate;
	}
	int years(int years) {
		return years;
	}
	double getfutureValue() {
		double i = savingsAccountopeningbalance ;
		double p =	Math.pow(1+this.intrestRate,years);
		double f = i*p;
		return f;
		
	}
	boolean withDraw(double amount) {
		if(amount > savingsAccountopeningbalance) {
			return false;
		}else {
			return true;
		}
		
	}
	boolean deposit(double amount) {
		if(amount < 0) {
			return false;
		}else {
			return true;
		}
		
	}
	
	public String toString() {
		return  "Savings Account Balance: " + savingsAccountopeningbalance +
				"\nSavings Account intrest rate: " + intrestRate +
				"\nSavings Account Balance in 3 years: " + getfutureValue();
		
		
	}
	

}
