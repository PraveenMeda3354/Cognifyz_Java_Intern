public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        
        Thread thread1 = new TransactionThread("Thread 1", account);
        Thread thread2 = new TransactionThread("Thread 2", account);
        Thread thread3 = new TransactionThread("Thread 3", account);

        
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
