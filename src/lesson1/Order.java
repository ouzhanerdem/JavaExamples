package lesson1;

public class Order {
    private int id;
    private User user;
    private Basket basket;

    public Order(int id, User user, Basket basket) {
        this.id = id;
        this.user = user;
        this.basket = basket;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    private void updateWalletBalance() {
        user.getWallet().setBalance(user.getWallet().getBalance() - basket.getTotalPrice());
    }

    private boolean orderIsSuccess() {
        if (user.getWallet().getBalance() < basket.getTotalPrice()) {
            return false;
        } else {
            return true;
        }
    }

    private String getOrderStatus() {
        if (!orderIsSuccess()) {
            return "Sipariş verilemedi. Yetersiz Bakiye! Mevcut Bakiye:  " + user.getWallet().getBalance();
        } else {
            updateWalletBalance();
            return "Sipariş verildi.";
        }
    }

    @Override
    public String toString() {
        return "lesson1.Order{" +
                "id=" + id +
                ", user=" + user +
                ", basket=" + basket +
                ", Sipariş durumu= " + getOrderStatus() +
                ", Cüzdan Bakiyesi= " + getUser().getWallet().getBalance() +
                '}';
    }
}
