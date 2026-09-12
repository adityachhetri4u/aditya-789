import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        InterestPolicy savingsPolicy = new SavingsInterestPolicy();
        InterestPolicy currentPolicy = new CurrentInterestPolicy();
        InterestPolicy salaryPolicy = new SalaryInterestPolicy();

        SavingsAccount mySavings = new SavingsAccount("SAV-111", 1000.0);
        CurrentAccount myCurrent = new CurrentAccount("CUR-222", 1000.0);
        SalaryAccount mySalary = new SalaryAccount("SAL-333", 1000.0);

        NotificationService emailNotifier = new NotificationService();
        Bank greenLeafBank = new Bank(emailNotifier);

        System.out.println("--- Processing Interests ---");
        greenLeafBank.processAccount(mySavings, savingsPolicy);
        greenLeafBank.processAccount(myCurrent, currentPolicy);
        greenLeafBank.processAccount(mySalary, salaryPolicy);

        System.out.println("\n--- LSP: Safe Withdrawals ---");
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD-999", 5000.0);

        List<Withdrawable> withdrawableAccounts = new ArrayList<>();
        withdrawableAccounts.add(mySavings);
        withdrawableAccounts.add(myCurrent);
        withdrawableAccounts.add(mySalary);
        

        for (Withdrawable acc : withdrawableAccounts) {
            acc.withdraw(50.0);
            System.out.println("Withdrew $50 safely.");
        }
        
        System.out.println("Fixed deposit balance remains safe: $" + fixedDeposit.getBalance());
    }
}
