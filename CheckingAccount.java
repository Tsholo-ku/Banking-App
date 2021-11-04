public class CheckingAccount extends Account {
    private double fee_charged;

    public CheckingAccount(double balance, double fees) {
        super(balance);
        this.fee_charged = fees;
    }

    public void credit(double amount) {
        this.account_balance = this.account_balance - this.fee_charged + amount;
    }

    @Override
    public void debit(double withdraw) {
        if (withdraw > account_balance) {
            System.out.println("The withdrawal amount is greater than the account balance.");
            System.out.println("Withdrawal cannot proceed.");
        }
        else {
            this.account_balance = this.account_balance - withdraw - fee_charged;
        }
    }
}
