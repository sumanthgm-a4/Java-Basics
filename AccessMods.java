// 1. public => Access from anywhere
// 2. protected => Access within the same package and subclasses
// 3. default => Access within the same package
// 4. private => Access ONLY within the same class

// To access private things use getters and setters

class Account {
    public String name;     // public
    private String password;   // private

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}

public class AccessMods {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "Sumanth";

        // acc1.password = "password";   // Results in an error
        acc1.setPassword("password");
        System.out.println(acc1.getPassword());
    }
}
