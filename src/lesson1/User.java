package lesson1;

public class User {
    private String name;
    private String surname;
    private int UserId;
    private Wallet wallet;

    public User(String name, String surname, int userId, double walletBalance) {
        this.name = name;
        this.surname = surname;
        UserId = userId;
        this.wallet = new Wallet(UserId, walletBalance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public String toString() {
        return "lesson1.User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", UserId=" + UserId +
                ", wallet=" + wallet +
                '}';
    }
}
