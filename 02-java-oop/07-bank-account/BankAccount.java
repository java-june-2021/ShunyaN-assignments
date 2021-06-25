import java.util.Random;
public class BankAccount {
    private String acctNumber;
    private double checkingBalance, savingBalance;
    private static int numberOfAccounts = 0;
    private static int totalAmounts = 0;

    public BankAccount() {
        this.acctNumber = randomAcctNum();
        numberOfAccounts++;
    }

    // rand 10 dgts num.
    private String randomAcctNum() {
        String acctNumber;
        char num[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        StringBuilder account = new StringBuilder();
        for(int i = 0; i < 10; i++){
            account.append(num[(int) Math.floor(Math.random() * 9)]);
        }
        acctNumber = account.toString();
        return acctNumber;
    }
    //methods getter
    public String getAcctNum(){
        return acctNumber;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingBalance(){
        return savingBalance;
    }


    public void depositChecking(double deposit){
        this.checkingBalance += deposit;
        totalAmounts += deposit;
    }

    public void depositSavings(double deposit){
        this.savingBalance += deposit;
        totalAmounts += deposit;
    }

    public String withdrawChecking(double withdraw){
        String fail = "Detects insufficient funds for transaction.";
        String success = "Transaction completed";
        if((getCheckingBalance() - withdraw) < 0){
            System.out.println(fail);
            return fail;
        }
        this.checkingBalance -= withdraw;
        totalAmounts -= withdraw;
        System.out.println(success);
        return success;
    }

    public String withdrawSavings(double withdraw){
        String fail = "Detects insufficient funds for transaction.";
        String success = "Transaction completed";
        if((getCheckingBalance() - withdraw) < 0){
            System.out.println(fail);
            return fail;
        }
        this.checkingBalance -= withdraw;
        totalAmounts -= withdraw;
        System.out.println(success);
        return success;
    }

    public static void totalFunds(){
        System.out.printf("Funds in total: %d\n", totalAmounts);
    }

    public static void totalAccount(){
        System.out.printf("Total amount in account: %d\n", numberOfAccounts);
    }
}