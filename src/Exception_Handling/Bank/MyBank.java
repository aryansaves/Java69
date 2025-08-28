package Exception_Handling.Bank;

public class MyBank {
    public static void main(String[] args) {
        Bank b = new Bank();
        try {
            b.withdraw(5000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
