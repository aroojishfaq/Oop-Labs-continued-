
import java.util.Scanner;
public class Main 
{
	public static void main (String args [])
	{  
		CheckingAccount checkAccount=new CheckingAccount("Aruj" ,"1222222222222",2000,500);
		System.out.println(checkAccount+"\n\n");	
		try 
		{
			checkAccount.withdraw(3000);
			}
		catch (InsufficientFundsException ex)
		{
			System.out.println ("Caught the Exception");
			System.out.println (ex.getMessage());
		}
		System.out.println(checkAccount+"\n\n");
	}
}