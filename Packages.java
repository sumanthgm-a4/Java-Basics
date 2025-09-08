import bank.Account;
import bank.Bank;

public class Packages {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.displayBankName();

        Account acc = new Account("Sumanth");
        acc.displayAccountHolder();
    }
}
