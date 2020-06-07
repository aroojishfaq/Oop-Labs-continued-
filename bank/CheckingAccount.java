
/**
 * Write a description of class CheckingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckingAccount extends BankAccount
{
    protected int limit;
    CheckingAccount(){
    this.limit=limit;
    }
    public void setLimit(int limit){
     this.limit=limit; 
    }
    
     public int getLimit(){
    return limit;
    }

    
    public long withdraw(int amountdraw){
        if (amountdraw>limit){
             System.out.println("Limit exceeded to withdraw more cash");
            }
   
   else if(amountdraw<limit){ 
       balance=balance-amountdraw;
    }
    return balance;
   } 
     public void display(){
    System.out.println("Limit: "+limit);
   
    }
   
}
    
