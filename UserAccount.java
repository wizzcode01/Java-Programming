package programming;

public class UserAccount {
    private final String username;
    private final String email;
    private final Wallet wallet;

    public UserAccount(String username, String email, double initialBalance) {
        this.username = username;
        this.email = email;
        this.wallet = new Wallet(initialBalance);
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Wallet getWallet() {
        return wallet;
    }
}