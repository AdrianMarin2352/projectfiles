public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AccountHolder account1 = new AccountHolder("Sadiq","","Manji","123456789",100.0,1000.0);
		
		AccountHolder ah1 = new AccountHolder("Adrian"," ","Marin-Cabrera","45678");
						
		ah1.addCheckingAccount(5000);
		ah1.addCheckingAccount(20000);
		ah1.addCheckingAccount(3000);
		ah1.addCheckingAccount(9000);
		
		
		
		
		CheckingAccount caccount = new CheckingAccount(5000);
		CheckingAccount caccount1 = new CheckingAccount(20000);
		CheckingAccount caccount2 = new CheckingAccount(4000);
		CheckingAccount caccount3 = new CheckingAccount(6000);
		
		
		ah1.addCheckingAccount(caccount);
		ah1.addCheckingAccount(caccount1);
		ah1.addCheckingAccount(caccount2);
		ah1.addCheckingAccount(caccount3);
		
		
		
		ah1.addSavingsAccount(5000);
		ah1.addSavingsAccount(6000);
		ah1.addSavingsAccount(7000);
		ah1.addSavingsAccount(8000);
		
		
		SavingsAccount saccount = new SavingsAccount(1000);
		SavingsAccount saccount1 = new SavingsAccount(2000);
		SavingsAccount saccount2 = new SavingsAccount(3000);
		SavingsAccount saccount3 = new SavingsAccount(4000);
		
		ah1.addSavingsAccount(saccount);
		ah1.addSavingsAccount(saccount1);
		ah1.addSavingsAccount(saccount2);
		ah1.addSavingsAccount(saccount3);
		System.out.println(ah1.getCombinedBalance());
}

}
