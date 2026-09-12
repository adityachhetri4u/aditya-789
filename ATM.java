public class ATM implements Depositable, Withdrawable {
    private BankAccount currentAccount;

    public void insertCard(BankAccount account) {
        this.currentAccount = account;
    }

    @Override
    public void deposit(double amount) {
        if (currentAccount != null) {
            currentAccount.deposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (currentAccount instanceof Withdrawable) {
            ((Withdrawable) currentAccount).withdraw(amount);
        }
    }
}
