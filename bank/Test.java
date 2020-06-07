
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String args[]){
     BankAccount ba=new BankAccount();
     ba.setAccNum(12);
     ba.getAccNum();
     ba.setBal(100);
     ba.getBal();
     ba.display();
     ba.deposit(20000);
     ba.withdraw(4000);
     
     CheckingAccount ca=new CheckingAccount();
     ca.setLimit(25000);
     ca.getLimit();
     ca.display();
     
     SavingsAccount sa=new SavingsAccount();
     sa.deposit(20000);
     sa.display();
     
     
    
    }
}
