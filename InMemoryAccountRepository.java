public class InMemoryAccountRepository implements AccountRepository {
    @Override
    public void save(BankAccount account) {
        System.out.println("Saving account to memory...");
    }
}
