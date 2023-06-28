public class BankCall {
    public static void main(String[] args) {

        // Creating a bank account object (BA123) with initial amount of Rs.500
        System.out.println("Create a bank account object (BA123) with initial amount of Rs.500 : ");
        BankAccount BA123 = new BankAccount("BA123", 500);

        // Depositing Rs. 1000/- into account BA123
        System.out.println("Deposit Rs. 1000/- into Account BA123: ");
        BA123.deposit(1000);
        System.out.println("New Balance after depositing Rs. 1000 :- " + BA123.getBalance());

        // Withdrawing Rs. 600/-  from BA123
        System.out.println("Withdraw Rs. 600/-  from BA123: ");
        BA123.withdraw(600);
        System.out.println("New Balance after withdrawing Rs. 600 :- " + BA123.getBalance());


        // Creating a savings account object (SA123) with initial balance of Rs. 450
        System.out.println("\nCreate a savings account object (SA123) with initial balance of Rs. 450: ");
        SavingAcc SA123 = new SavingAcc("SA123", 450);

        // Withdrawing Rs. 300 from SA123
        SA123.withdraw(300);
        System.out.println("New Balance after withdrawal of Rs. 300: Rs." + SA123.getBalance());


        // Creating a Savings Account SA000 with inital balance of Rs. 300
        System.out.println("\nCreate a Savings Account SA000 with inital balance of Rs. 300: ");
        SavingAcc SA000 = new SavingAcc("SA000", 300);

        // Withdrawing Rs.250 from SA000 (Balance falls below 100)
        System.out.println("Withdrawing Rs.250 from SA000: ");
        SA000.withdraw(250);
        System.out.println("Balance after withdrawal of Rs. 250: " + SA000.getBalance());

    }
}
