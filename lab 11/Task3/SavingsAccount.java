
public class SavingsAccount extends BankAccount 
{
	//Field Variable 
	private double interestRate;
	
	public SavingsAccount (String accountHolderName, String accountNumber, double accountBalance, double interestRate)
	{
		super (accountHolderName,accountNumber,accountBalance);
		this. interestRate=interestRate; 
	}
	

	public void addInterestAmount()
	{
	  accountBalance=accountBalance+(interestRate*accountBalance);	 
	}
	
	
	//Setter Method of Savings Account 
	public void setInterestRate(double interestRate)
	{
		this.interestRate=interestRate;
	}
	
	//Getter Method 
	public double getInterestRate()
	{
		return interestRate;
	}
	
	
	//toString Method of Savings Account 
	public String toString ()
	{
		return "Account Type:Savings Account"+"\nInterest Rate:"+interestRate+"%\n"+super.toString();
	}
	
}