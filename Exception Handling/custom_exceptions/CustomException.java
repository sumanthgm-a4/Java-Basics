public class CustomException {
    public static void main(String[] args) {
        BankAccount bankacc = new BankAccount(1000);

        try {
            bankacc.withdraw(2000);
        } catch (InsufficientFundsException e) {
            System.out.println(e);
        }
    }
}
