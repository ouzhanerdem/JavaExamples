package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private int id;
    private List<LineItem> lineItems;

    public Basket(int id) {
        this.id = id;
        this.lineItems = new ArrayList<LineItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public void addlLineItem(int id, int quantity, Product p) {
        this.lineItems.add(new LineItem(id, quantity, p));

    }

    public int getTotalPrice() {

        int totalPrice = 0;

        for (int i = 0; i < lineItems.size(); i++) {
            totalPrice += lineItems.get(i).getPrice();

        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Sepet{" +
                "id=" + id + "\n" +
                ", lineItems=" + lineItems +
                ", total price= " + getTotalPrice() +
                '}';
    }

}
