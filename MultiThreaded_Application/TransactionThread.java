import java.util.Random;

public class TransactionThread extends Thread {
    private static final Random random = new Random();
    private BankAccount account;

    public TransactionThread(String name, BankAccount account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        
        for (int i = 0; i < 5; i++) {
            double amount = random.nextDouble() * 100;
            account.withdraw(amount);
            try {
                Thread.sleep(random.nextInt(1000)); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
