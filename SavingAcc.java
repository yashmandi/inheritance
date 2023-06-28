public class SavingAcc extends BankAccount {
    public SavingAcc (String accNum, double balance) {
        super (accNum, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Minimum balance of Rs. 100 is required!!");
        } else {
            super.withdraw(amount);
        }
    }
}
