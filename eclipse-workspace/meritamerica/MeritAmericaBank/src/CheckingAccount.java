public class CheckingAccount {
	
	private double checkingAccountopeningbalance;
	private double intrestRate = .001;
	private int years = 3;
	
	public CheckingAccount( double checkingAccountopeningbalance) {
		this.checkingAccountopeningbalance = checkingAccountopeningbalance;
		
		}
	double getbalance() {
		return checkingAccountopeningbalance;

	}
	double getintrestRate() {
		return intrestRate;
	}
	int years(int years) {
		return years;
	}
	double getfutureValue() {
		double i = checkingAccountopeningbalance ;
		double p =	Math.pow(1+this.intrestRate,years);
		double f = i*p;
		return f;
		
	}
	boolean withDraw(double amount) {
		if(amount > checkingAccountopeningbalance) {
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
		return "Checking Account Balance: " + checkingAccountopeningbalance +
				"\nChecking Account intrest rate: " + intrestRate +
				"\nChecking Account Balance in 3 years: " + getfutureValue();
		
		
	}
	
		
}
