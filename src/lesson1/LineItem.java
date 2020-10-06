package lesson1;

public class LineItem {
    private int id;
    private int quantitiy;
    private Product p;
    private double price;

    public LineItem(int id, int quantitiy, Product p) {
        this.id = id;
        this.quantitiy = quantitiy;
        this.p = p;
        this.price = p.getPrice() * quantitiy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantitiy() {
        return quantitiy;
    }

    public void setQuantitiy(int quantitiy) {
        this.quantitiy = quantitiy;
    }

    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "lesson1.LineItem{" + "\n" +
                "id=" + id +
                ", quantitiy=" + quantitiy +
                ", p=" + p +
                ", Total price=" + price +
                '}';
    }
}
