public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    
    public synchronized void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount + "...");
            balance -= amount;
            System.out.println("New balance after withdrawal by " + Thread.currentThread().getName() + ": " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " cannot withdraw " + amount + " due to insufficient balance.");
        }
    }


    public double getBalance() {
        return balance;
    }
}
