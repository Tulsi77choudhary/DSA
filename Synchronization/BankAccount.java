package Synchronization;

public class BankAccount {
    private int balance = 0; 

    public synchronized void deposit(int amount){
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public synchronized int withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
            return amount;
        } else {
            System.out.println("Withdrawal of " + amount + " failed, insufficient funds. Current Balance: " + balance);
            return 0;
        }
        
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable r = () -> account.deposit(1000);
        Runnable r1 = () -> account.withdraw(500);
        Thread thread = new Thread(r);
        Thread thread1 = new Thread(r1);

        thread.start();
        thread1.start();
           

    }
    
}
