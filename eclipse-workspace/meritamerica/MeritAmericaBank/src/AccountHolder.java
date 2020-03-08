public class AccountHolder {
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssnNumber;
	private CheckingAccount[] checkingAccount = new CheckingAccount[50];
	private SavingsAccount[] savingsAccount = new SavingsAccount[50];
	public int position;
	public int position1;
	public double combinedBalance;
	public double combinedBalance1;
	
	
	//default constructor
	public AccountHolder() {}
	
	public AccountHolder(String firstName, String middleName, String lastName,
			String ssnNumber ) {
		
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
			this.ssnNumber = ssnNumber;
			
	}
	
	String getfirstName() {
		return firstName;
	}

	void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	String getmiddleName() {
		return middleName;
}
	void setmiddleName(String middleName) {
		this.middleName = middleName;
	}
	String getlastName() {
		return lastName;
	
	}
	void setlastName(String lastName) {
		this.lastName = lastName;
}
	String getssnNumber() {
		return ssnNumber;
	}
	void setssnNumer(String ssnNumber) {
		this.ssnNumber = ssnNumber;
		}
	
	CheckingAccount[] getCheckingAccounts() {
		return checkingAccount;
		
		}
	
	CheckingAccount addCheckingAccount(double openingBalance) {
		int position = 0;
		double combinedBalance = 0;
		
		for (int i = 0; i < checkingAccount.length; i++) {
			if(checkingAccount[i] != null) {
				combinedBalance += checkingAccount[i].getbalance();
				position++;
				
			}
			else 
				break;
			
		}
		if(combinedBalance + combinedBalance1 + openingBalance < 250000) {
			checkingAccount[position] = new CheckingAccount(openingBalance);
			this.combinedBalance = combinedBalance + openingBalance;
			this.position = position;
			
			}
		else System.out.println("Can't create this account");
		return checkingAccount[position];
		
	}
	
	CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		int position = 0;
		double combinedBalance = 0;
	
		
		for (int i = 0; i < this.checkingAccount.length; i++) {
			if(this.checkingAccount[i] != null) {
				combinedBalance += this.checkingAccount[i].getbalance();
				position++;
				}
			else 
				break;
		}
			if(combinedBalance + combinedBalance1 + checkingAccount.getbalance() < 250000) {
				this.checkingAccount[position] = checkingAccount;
				this.combinedBalance = combinedBalance;
				position = this.position;
				}
			else System.out.println("Can't create this account");
			return checkingAccount;
		}
		
	
	int getNumberOfCheckingAccounts() {
		return position + 1;
		
	}
	double getCheckingBalance() {
		return checkingAccount[0].getbalance();
		
	}
	
	SavingsAccount addSavingsAccount(double openingBalance) {
		int position1 = 0;
		double combinedBalance1 = 0;
	
		
		for (int i = 0; i < savingsAccount.length; i++) {
			if(savingsAccount[i] != null) {
				combinedBalance1 += savingsAccount[i].getbalance();
				position1++;
			}
			else break;
			
			}
		if(combinedBalance1 + combinedBalance + openingBalance < 250000) {
			savingsAccount[position1] = new SavingsAccount(openingBalance);
			this.combinedBalance1 = combinedBalance1 + openingBalance;
			this.position1 = position1;
		}
			
			else System.out.println("Can't create this account");
			return savingsAccount[position1];
	}
	SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		int position1 = 0;
		double combinedBalance1 = 0;
		
		for(int i = 0; i < this.savingsAccount.length; i++) {
			if(this.savingsAccount[i] != null) {
				combinedBalance1 += this.savingsAccount[i].getbalance();
				position1++;
			}
		
			else 
				break;
			
		}
		if(combinedBalance1 + combinedBalance + savingsAccount.getbalance() < 250000) {
			this.savingsAccount[position1] = savingsAccount;
			this.combinedBalance1 = combinedBalance1;
			position1 = this.position1;
			
		}
		else System.out.println("This account can't be created.");
		return savingsAccount;
		
	}
	
	SavingsAccount[] getSavingsAccounts() {
		return savingsAccount;
		
	}
	int getNumberOfSavingsAccounts() {
		return position1 +1;
	}
	double getSavingsBalance() {
		return savingsAccount[0].getbalance();
	}
	CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		
	}
	CDAccount addCDAccount(CDAccount cdAccount) {
		
	}
	CDAccount[] getCDAccounts() {
		
	}
	double getCDBalance() {
		
	}
	double getCombinedBalance() {
		
		return combinedBalance1 + combinedBalance;
	}
	int getNumberOfCDAccounts() {
		
	}
	
	public String toString() {
		return "Name: " + firstName + " " + middleName + " " + " " + lastName +
				"\nSocial Security: " + ssnNumber + 
				"\n" + A.toString() +
				"\n" + B.toString();
	}
	
}
	