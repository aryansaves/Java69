package Exception_Handling.Bank;

public class Bank {
    private int balance = 50000;
    public void withdraw(int amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn, Remaining Balance: " + balance);
        }
    }
}
