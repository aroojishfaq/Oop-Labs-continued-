
/**
 * Write a description of class SavingsAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingsAccount extends BankAccount
{
    protected int amountin;
    
    SavingsAccount(){   
    }
    public void setAmountIn(int amountin){
    this.amountin=amountin;
    }
    public int getAmountIn(){
    return amountin;
    }
    
   public long deposit(int bal){
    balance=balance+bal;
    return balance;
    }
    public String toString(){
    return "Amount deposited: "+amountin;
    }
      public void display(){
    System.out.println("Total balance after Amount deposited: "+balance);
   
    }
}
