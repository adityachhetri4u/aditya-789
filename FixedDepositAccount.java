public class FixedDepositAccount extends BankAccount {
    public FixedDepositAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }
    
    // Notice: It does NOT implement Withdrawable, and has no withdraw() method!
    // This perfectly fixes the LSP violation because we can't accidentally withdraw from it.
}
