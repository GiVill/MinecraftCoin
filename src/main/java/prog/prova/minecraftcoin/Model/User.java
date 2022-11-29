package prog.prova.minecraftcoin.Model;

public class User {
    private String name;
    private String username;
    private int balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public User(String name, String username, int balance) {
        this.name = name;
        this.username = username;
        this.balance = balance;
    }
}
