public class Bank {
    // Bank accepts a NotificationService through its constructor.
    // This means we can swap it with SMSNotificationService later without touching this code!
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
