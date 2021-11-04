public class Account {
    protected double account_balance;
    public Account(double account_balance){
        if(account_balance>=0.0){
            this.account_balance=account_balance;
        }
        else{
            this.account_balance=0.0;
            System.out.println("The initial account balance is invalid.");
        }
    }
    public void credit(double amount){
        this.account_balance=this.account_balance+amount;
    }
    public void debit(double withdraw){
        if(account_balance<withdraw){
            System.out.println("Debit amount exceeded account balance.");
        }
        else{
            this.account_balance=this.account_balance-withdraw;
        }
    }
    public double getBalance(){
        return this.account_balance;
    }
}

