public class Bank {
    // Bank now depends entirely on abstractions (interfaces), perfectly following DIP!
    private NotificationService notifier;
    private AccountRepository repository;

    public Bank(NotificationService notifier, AccountRepository repository) {
        this.notifier = notifier;
        this.repository = repository;
    }

    public void processAccount(BankAccount account, InterestPolicy policy) {
        double interest = policy.calculate(account.getBalance());
        account.deposit(interest);
        
        notifier.send("Interest of $" + interest + " added. New balance is $" + account.getBalance());
        repository.save(account); // Save to whatever DB was injected
    }
}
