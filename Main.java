public class Main {
    public static void main(String[] args) {
        InterestPolicy savingsPolicy = new SavingsInterestPolicy();
        SavingsAccount mySavings = new SavingsAccount("SAV-111", 1000.0);

        // Injecting dependencies into Bank
        NotificationService emailNotifier = new EmailNotificationService();
        
        // --- THIS IS THE ONLY LINE WE CHANGED TO SWAP THE DATABASE! ---
        AccountRepository repository = new FileAccountRepository(); 
        
        Bank greenLeafBank = new Bank(emailNotifier, repository);

        System.out.println("--- Processing Interests with File DB ---");
        greenLeafBank.processAccount(mySavings, savingsPolicy);
        
        // ATM testing
        System.out.println("\n--- Testing ATM (ISP) ---");
        ATM atm = new ATM();
        atm.insertCard(mySavings);
        atm.deposit(50.0);
        atm.withdraw(20.0);
        System.out.println("ATM operations successful. Current balance: $" + mySavings.getBalance());
    }
}
