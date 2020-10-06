package lesson1;

public class Wallet {
    private int walletId;
    private double balance;

    public Wallet(int walletId, double balance) {
        this.walletId = walletId;
        this.balance = balance;
    }

    public int getWalletId() {
        return walletId;
    }

    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "lesson1.Wallet{" +
                "walletId=" + walletId +
                ", balance=" + balance +
                '}';
    }
}
