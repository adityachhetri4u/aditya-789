public class Main {
    public static void main(String[] args) {
        // Create the different interest policies
        InterestPolicy savingsPolicy = new SavingsInterestPolicy();
        InterestPolicy currentPolicy = new CurrentInterestPolicy();
        InterestPolicy salaryPolicy = new SalaryInterestPolicy();

        // Create the accounts
        BankAccount mySavings = new BankAccount("SAV-111", 1000.0);
        BankAccount myCurrent = new BankAccount("CUR-222", 1000.0);
        SalaryAccount mySalary = new SalaryAccount("SAL-333", 1000.0);

        // We can pass our existing NotificationService into the Bank
        NotificationService emailNotifier = new NotificationService();
        Bank greenLeafBank = new Bank(emailNotifier);

        // Process interest using policies instead of an ugly if/else chain!
        System.out.println("--- Processing Savings ---");
        greenLeafBank.processAccount(mySavings, savingsPolicy);

        System.out.println("\n--- Processing Current ---");
        greenLeafBank.processAccount(myCurrent, currentPolicy);

        System.out.println("\n--- Processing Salary ---");
        greenLeafBank.processAccount(mySalary, salaryPolicy);
    }
}
