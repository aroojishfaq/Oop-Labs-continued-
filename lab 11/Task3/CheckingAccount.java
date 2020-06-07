

public class CheckingAccount extends BankAccount
{
	//Field Variable 
	private double balanceLimit; 
	
	//Parametrized constructor to create a checking account
	CheckingAccount (String accountHolderName, String accountNumber, double accountBalance, double balanceLimit )
	{
		super (accountHolderName,accountNumber,accountBalance); //Constructor of parent class BankAccount is called. 
		this. balanceLimit=balanceLimit; 
	}
	
	//Deposit Method for Checking Account
	public void deposit (double depositAmount)
	{
		super.deposit(depositAmount); 
	}
	
	//Withdraw Method for Checking Account 
	public void withdraw (double withdrawMoney)
	throws InsufficientFundsException
	{
	   if ( (accountBalance-withdrawMoney)<balanceLimit) 
	        throw new InsufficientFundsException ("Transacton is invalid as account balance falls below minimum amount to be maintained in account.");
		else 
			super.withdraw(withdrawMoney); 
}  
	//Setter Method for Balance Limit
    public void setBalanceLimit( double balanceLimit)
    {
		this. balanceLimit=balanceLimit;
		
	}	
	
	//Getter Method for Balance limit
	public double setBalanceLimit ()
	{
		return balanceLimit;
	}
	
	//to String Method of Checking Account 
	public String toString ()
	{
		return "Account Type:Checking Account"+"\nAccounnt Balnce Limit:"+ balanceLimit+" Rs.\n"+super.toString();
	}
}