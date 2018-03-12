package pl.krystiano;

import org.junit.Before;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setup() {
        account = new BankAccount("Krystian", "Lc", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void deposit() throws Exception {
        double deposit = account.deposit(200.00, true);
        assertEquals(1200.00, deposit, 0.001);
    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        account.deposit(200, true);
        assertEquals(1200.00, account.getBalance(), 0.001);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
        account.withdraw(200, true);
        assertEquals(800.00, account.getBalance(), 0.001);
    }

    @org.junit.Test
    public void isChecking() {
        assertTrue(account.isChecking());
    }
}