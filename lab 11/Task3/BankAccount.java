
public class BankAccount 
{
 
	protected String accountHolderName;   
	protected String accountNumber;
	protected double accountBalance;
	
	
	protected BankAccount (String accountHolderName, String accountNumber, double accountBalance)
	{
		this. accountHolderName=accountHolderName; 
		this. accountNumber=accountNumber;        
		this. accountBalance=accountBalance;     
	}
	
	
	//Deposit Method 
	protected void deposit (double depositAmount)
	{  
	    if (depositAmount>0)
		accountBalance=accountBalance + depositAmount;   //increses bank accountBalance of account holder 
	    else  
		System.out.println("Invalid amount. This amount can not be deposited into your account"); //issues warning incase incase invalid amounnt is passed
	}
	
	
	
	//Withdraw Method 
	protected void withdraw (double withdrawAmount) throws InsufficientFundsException
	{
		if (withdrawAmount>accountBalance)  
		throw new InsufficientFundsException ("You have insuffcient balance in Your Account.");
	    else 
		accountBalance=accountBalance-withdrawAmount; 
	}
	
	

	
	protected void setAccountHolderName(String accountHolderName)
	{
		this. accountHolderName=accountHolderName;
	}
	
	protected void setAccountNumber(String accountNumber)
	{
		this. accountNumber=accountNumber;
	}
	
	protected void setAccountBalance (double accountBalance)
	{
		this. accountBalance=accountBalance;
	}
	
	
	
	
	protected String getAccountHolderName()
	{
		return accountHolderName;
	}
	
	protected String getAccountNumber()
	{
		return accountNumber;
	}
	
	protected double getAccountBalance ()
	{
		return accountBalance;
	}
	
	//toString method of BankAccount class 
	public String toString ()
	{	
		return "Account Holder:"+accountHolderName+ "\nAccount Number:"+accountNumber+"\nAccount Balance:"+accountBalance;
	}
}