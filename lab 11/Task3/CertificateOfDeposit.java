public class CertificateOfDeposit extends BankAccount 
{

	private boolean termLengthCompleted; 
	private double interestRate;
	
	public CertificateOfDeposit (String accountHolderName, String accountNumber, double accountBalance, double interestRate)
	{
		super (accountHolderName,accountNumber,accountBalance); 
		this. termLengthCompleted=false;
		this. interestRate=interestRate;
	}
	//add interest amount method 
	public void addInterestAmount ()
	{
		accountBalance=accountBalance+(accountBalance*interestRate);
	}
	
	
	//Implementation of deposit method
	public void deposit (double depositAmount)
	{
	  if (termLengthCompleted)
	     super.deposit(depositAmount);
	   else
		   System.out.println("Your account has not matured yet. Funds can not be deposited into account.");
	   }
	   
	//implemetation of withdraw method 
	public void withdraw (double withdrawAmount)
	throws InsufficientFundsException
	{
	 if (termLengthCompleted)
		 
	 {
		 super.withdraw(withdrawAmount);
	 }
	 else 
		 System.out.println("Your account has not matured yet. Funds can not be withdrawn from account.");
	  }
	  
	  //Setter Methods 
	  
	  public void setInterestRate (double interestRate)
	  {
		  this.interestRate=interestRate;
	  }
	  
	  public void setAccountMaturity (boolean termLengthCompleted)
	  {
		  this. termLengthCompleted=termLengthCompleted;
	  }
	  
	  //Getter Methods 
	  
	  public double getInterestRate ()
	  {
		  return interestRate;
	  }
	  
	  public boolean getAccountMaturity ()
	  {
		  if (termLengthCompleted)
		  return true;
		  else 
		   return false;
	  }
	  
	public String toString()
	{
		String termlength;
		if (termLengthCompleted)
			termlength="Term Length Completed";
		else
			termlength="Term Length NOT Completed";
		
		return "Account Type:Certificate of Deposit"+"\n"+super.toString () +"\nInterest Rate:"+interestRate+"%\nAccount Status:"+termlength;
	}
}