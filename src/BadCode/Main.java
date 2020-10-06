package BadCode;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");
        Product product = new Product(1, "ÜRÜN", 2);
        ProductManager productManager = new ProductManager();
        productManager.add(product, 1);


    }
}
