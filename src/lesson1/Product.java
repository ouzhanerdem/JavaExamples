package lesson1;

public class Product {
    private String name;
    private String description;
    private int id;
    private double price;

    public Product(String name, String description, int id, double price) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "lesson1.Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id + "\n" +
                ", price=" + price +
                '}';
    }

}
