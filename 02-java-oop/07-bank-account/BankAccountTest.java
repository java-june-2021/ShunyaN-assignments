public class BankAccountTest {
    public static void main (String[] args){
        BankAccount newaccount = new BankAccount();
        BankAccount newaccount2 = new BankAccount();

        System.out.println(newaccount.getAcctNum());
        System.out.println(newaccount2.getAcctNum());
        newaccount.depositChecking(10000.00);
        newaccount.depositChecking(5000.00);
        newaccount.depositSavings(5000.00);
        newaccount2.depositChecking(1000.00);
        newaccount2.depositChecking(5000.00);
        newaccount2.depositChecking(5000.00);
        System.out.println(newaccount.getCheckingBalance());
        newaccount.withdrawChecking(26500.00);
        newaccount2.withdrawChecking(7650.00);
        BankAccount.totalFunds();
        BankAccount.totalAccount();
        System.out.println(newaccount.getCheckingBalance());
        System.out.println(newaccount2.getCheckingBalance());
    }
}
