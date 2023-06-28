/* Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account
balance falls below one hundred. */


// Parent Class 
public class BankAccount {
    private String accNum;
    private double balance;

    public BankAccount(String accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }
    
    // Method1
    public void deposit (double amount) {
        balance += amount;
    }

    // Method2
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
