import java.io.FileWriter;
import java.io.IOException;

public class FileAccountRepository implements AccountRepository {
    @Override
    public void save(BankAccount account) {
        try (FileWriter writer = new FileWriter("accounts.txt", true)) {
            writer.write(account.getAccountNumber() + ",name," + account.getBalance() + "\n");
            System.out.println("Saved account " + account.getAccountNumber() + " to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
