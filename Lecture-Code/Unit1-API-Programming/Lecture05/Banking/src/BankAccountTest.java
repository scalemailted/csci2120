import static org.junit.jupiter.api.Assertions.*;


class BankAccountTest {

    private BankAccount account;

    @org.junit.jupiter.api.BeforeEach
    public void setup(){
        account = new BankAccount("Ted", "Holmberg", 100.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }


    @org.junit.jupiter.api.Test
    void deposit() {
        double balance = account.deposit(75.00, true);
        assertEquals(175.00, balance, 0);
    }


    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        account.deposit(75.00, true);
        assertEquals(175.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        account.withdraw(75.00, true);
        assertEquals(25.00, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void isChecking_true() {
        assertTrue(account.isChecking(), "The account is not checking");
    }

    @org.junit.jupiter.api.Test
    void withdraw_branch() throws  Exception{
        double balance = account.withdraw(60.00, true);
        assertEquals(40.00, balance, 0);
    }

    @org.junit.jupiter.api.Test
    void withdraw_notBranch() throws Exception{
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            //Code under test
            double balance = account.withdraw(600.00, false);
        });
        assertEquals("Cannot Withdraw", thrown.getMessage());
    }










}