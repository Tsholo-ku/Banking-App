public class SavingsAccount extends Account {
    private double interest_rate;

    public SavingsAccount(double balance, double interest_rate) {
        super(balance);
        this.interest_rate = interest_rate;
    }

    public double calculateInterest() {
        return this.interest_rate * this.account_balance;
    }
}
