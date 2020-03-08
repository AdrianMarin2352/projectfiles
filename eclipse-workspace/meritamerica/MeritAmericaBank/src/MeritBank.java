public class MeritBank {
	private double CDOferrings;

	
	static void addAccountHolder(AccountHolder accountHolder) {
		
	}
	
	static AccountHolder[] getAccountHolders() {
		return AccountHolders;
		
	}
	static CDOffering[] getCDOfferings() {
		return CDOfferings;
		
	}
	static CDOffering getBestCDOffering(double depositAmount) {
		return BestCDOoffering;
		
	}
	static CDOffering getSecondBestCDOffering(double depositAmount) {
		return SecondBestCDOffering;
		
	}
	static void clearCDOfferings() {
		
	}
	static void setCDOfferings(CDOffering[] offerings) {
		this.CDOffering = CDOfferings;
		
	}
	static long getNextAccountNumber() {
		return NextAccountNumber;
		
	}
	static double totalBalances() {
		
	}
	static double futureValue(double presentValue, double interestRate, int term) {
		
	}
		
}