
public class BankAccount {
    private double balance;

    public BankAccount(double amt) {
        this.balance = amt;
    }

    public void withdraw(double amt) throws InsufficientFundsException {
        if (amt > this.balance) {
            throw new InsufficientFundsException();
        }
        this.balance -= amt;
    }
}
