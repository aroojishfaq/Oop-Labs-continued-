
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
   protected int account_number;
   protected long balance;
   BankAccount(){
       this.account_number=account_number;
       this.balance=balance;
    }
    public void setAccNum(int account_number){
     this.account_number=account_number;
    }
    public void setBal(long balance){
       this.balance=balance;
    }
     public int getAccNum(){
     return account_number;
    }
    public long getBal(){
      return balance;
    }
    public long deposit(int bal){
    balance=balance+bal;
    System.out.println("New balance after depositing money is:"+balance);
    return balance;
    
    }
    public long withdraw(int amountdraw){
    balance=balance-amountdraw;
    System.out.println("Remaining balance after withdrawing money is:"+balance);
    return balance;  
   }
   public String toString(){
    return "Account number: "+account_number+"    Total Balance: "+balance;
    }
    public void display(){
    System.out.println("Account number: "+account_number);
    System.out.println("Total Balance: "+balance);
 
    }
}
