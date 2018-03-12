package pl.krystiano;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() throws Exception {
        BankAccount account = new BankAccount("Krystian", "Lc", 1000.00);
        double deposit = account.deposit(200.00 ,true);
        assertEquals(1200.00, deposit,0.001);
        assertEquals(1200.00, account.getBalance(), 0.001);
    }

    @org.junit.Test
    public void withdraw() throws Exception {
        fail("This has to be implemented");
    }

    @org.junit.Test
    public void getBalance() throws Exception {
        BankAccount account = new BankAccount("Krystian", "Lc", 1000.00);
        double deposit = account.deposit(200.00 ,true);
        assertEquals(1200.00, account.getBalance(), 0.001);
    }
}