package pl.krystiano;

import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("This executes before any test cases. Count = " + count++);
    }

    @Before
    public void setup() {
        account = new BankAccount("Krystian", "Lc", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @After
    public void teardown() {
        System.out.println("Count = " + count++);
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("This executes after any test cases. Count =" + count++);
    }

    @org.junit.Test
    public void deposit() throws Exception {
        double deposit = account.deposit(200.00, true);
        assertEquals(1200.00, deposit, 0.001);
    }

    @Test
    public void withdraw_branch() throws Exception {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception {
        account.withdraw(600.00, false);
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