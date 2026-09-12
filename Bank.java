public class Bank {
    
    private NotificationService notifier;

    public Bank(NotificationService notifier) {
        this.notifier = notifier;
    }

    public void processAccount(BankAccount account, InterestPolicy policy) {
        double interest = policy.calculate(account.getBalance());
        account.deposit(interest);
        notifier.send("Interest of $" + interest + " added. New balance is $" + account.getBalance());
    }
}
