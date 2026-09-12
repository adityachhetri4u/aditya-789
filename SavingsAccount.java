public class SavingsAccount extends BankAccount implements Depositable, Withdrawable, Transferable, StatementProvider {
    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
    }
    
    // Depositable's deposit(double) is already perfectly satisfied by the BankAccount superclass!

    @Override
    public void transfer(double amount, String toAccount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Transferred $" + amount + " to " + toAccount);
        }
    }

    @Override
    public String printStatement() {
        return "Savings Account Statement - Balance: $" + balance;
    }
}
