public class Main {
    public static void main(String[] args) {
       
        InterestPolicy savingsPolicy = new SavingsInterestPolicy();
        InterestPolicy currentPolicy = new CurrentInterestPolicy();
        InterestPolicy salaryPolicy = new SalaryInterestPolicy();

        BankAccount mySavings = new BankAccount("SAV-111", 1000.0);
        BankAccount myCurrent = new BankAccount("CUR-222", 1000.0);
        SalaryAccount mySalary = new SalaryAccount("SAL-333", 1000.0);

        NotificationService emailNotifier = new NotificationService();
        Bank greenLeafBank = new Bank(emailNotifier);

        System.out.println("--- Processing Savings ---");
        greenLeafBank.processAccount(mySavings, savingsPolicy);

        System.out.println("\n--- Processing Current ---");
        greenLeafBank.processAccount(myCurrent, currentPolicy);

        System.out.println("\n--- Processing Salary ---");
        greenLeafBank.processAccount(mySalary, salaryPolicy);
    }
}
