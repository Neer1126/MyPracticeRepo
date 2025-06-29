import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    private Account account;

    @Before
    public void setUp() {
        account = new Account(1000.0);  // Arrange
        System.out.println("Account initialized.");
    }

    @After
    public void tearDown() {
        System.out.println("Test completed.\n");
    }

    @Test
    public void testDeposit() {
        // Act
        account.deposit(500.0);

        // Assert
        assertEquals(1500.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdraw() {
        // Act
        account.withdraw(300.0);

        // Assert
        assertEquals(700.0, account.getBalance(), 0.01);
    }

    @Test
    public void testOverWithdraw() {
        // Act
        account.withdraw(2000.0); // Should be ignored due to insufficient balance

        // Assert
        assertEquals(1000.0, account.getBalance(), 0.01);
    }
}
