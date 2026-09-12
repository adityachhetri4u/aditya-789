public class StatementGenerator {
    public String generate(BankAccount account) {
       
        return "Statement for Account [" + account.getAccountNumber() + "]\n" +
               "Current Balance: $" + account.getBalance();
    }
}
