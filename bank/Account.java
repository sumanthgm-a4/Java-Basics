package bank;

public class Account {
    String name;

    public Account(String name) {
        this.name = name;
    }

    public void displayAccountHolder() {
        System.out.println("Account holder: " + name);
    }
}
