package javaReq;



//Req.1 build a bank account application using encapsulation. User can see balance,withdraw many
//and deposit money to the account



public class BankAccount {
	//hiding data
	private String accountNumber;
	private double balance;
	
	//constructor
	public BankAccount(String accountNumber, double initialBalance) {
		
		this.accountNumber = accountNumber;
		
		if (initialBalance >= 0)
			
		{
			this.balance = initialBalance;
		}
	}
		// public getter for account number
		public String getAccountNumber() {
			return accountNumber;
		
	}
	
	// public getter for balance
		
		// public getter for account number
				public double getBalance() {
					return balance;
				
			}
	
	// public method for deposit money
				public void deposit(double amount) {
					
					if (amount > 0) {
						
						balance += amount;
						System.out.println(amount);
					}
					
				}
				
			// public method for withdraw money
				
				public boolean withdraw(double amount) {
					
					if(balance >= 0 &&  amount <= balance) {
						return true;
					}else
					{
						return false;
					}
				}
	
  public static void main(String[]arges) {
  	
  	BankAccount acc = new BankAccount("1000000", 500.00);
  	System.out.println("Balance: " + acc.getBalance());
  
  }
}

	
		
		
		
	


