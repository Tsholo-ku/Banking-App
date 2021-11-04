public class Main {
    public static void main(String[] args){
        Account myAccount = new Account(4000);
        myAccount.debit(200);
        myAccount.credit(6000);
        double balance=myAccount.getBalance();
        System.out.println("Your balance is now: "+balance);

        CheckingAccount myCheckingAccount = new CheckingAccount(2000, 350);
        myCheckingAccount.credit(1000);
        myCheckingAccount.debit(1500);
        double balance2=myCheckingAccount.getBalance();
        System.out.println("Your Checking Account balance is: "+balance2);

        SavingsAccount mySavingsAccount = new SavingsAccount(5500, 0.1);
        mySavingsAccount.credit(2000);
        mySavingsAccount.debit(6000);
        double interest=mySavingsAccount.calculateInterest();
        System.out.println("The interest rate is: "+interest);
        double balance3=mySavingsAccount.getBalance();
        System.out.println("Your Savings Account balance is: "+balance3);
    }
}
