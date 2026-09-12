public class Main {
    public static void main(String[] args) {
        
        BankAccount myAccount = new BankAccount("ACCT-1234", 100.0);
        
        myAccount.deposit(50.0);
        myAccount.withdraw(20.0);
        myAccount.deposit(10.0);
        
        AccountRepository repository = new AccountRepository();
        repository.save(myAccount);
        
        NotificationService notifier = new NotificationService();
        notifier.send("Your transaction was successful. Balance is now $" + myAccount.getBalance());
        
        StatementGenerator generator = new StatementGenerator();
        String myStatement = generator.generate(myAccount);
        
        System.out.println("\n--- PRINTED STATEMENT ---");
        System.out.println(myStatement);
    }
}
