package lesson1;

public class Main {

    public static void main(String[] args) {

        User user = new User("Yahya", "Kaya", 2000, 100);
        Product product = new Product("Lahmacun", "Acılı", 13423, 10);
        Product product1 = new Product("Kola", "Zero", 4312, 5);
        Product product2 = new Product("Künefe", "Kaymaklı", 321, 25);

        Basket basket = new Basket(1);
        basket.addlLineItem(1, 2, product);
        basket.addlLineItem(2, 1, product1);
        basket.addlLineItem(3, 1, product2);

        Order order = new Order(1, user, basket);
        System.out.println(order);
    }
}
