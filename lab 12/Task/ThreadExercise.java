public class ThreadExercise extends Thread implements Runnable {

private Person person;

public ThreadExercise(Person p) {
    this.person = p;
}

public static void main(String[] args) {

    ThreadExercise t1 = new ThreadExercise(new Person("person 1"));
    t1.start();
    ThreadExercise t2 = new ThreadExercise(new Person("person 2"));
    t2.start();
  
}

@Override
public void run() {
    for (int i = 0; i < 2; i++) 
     {
        try {
            Account acc = Account.getAccount(person);
            acc.withdraw(1000);
            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException ex) {
               
            }
            if (acc.getBal() < 0) {
                System.out.println("account is overdrawn!");
            }
            acc.deposit(1000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    System.out.println("Final Acc balance is Rs." + Account.getBal());
}}