package practice_15.Z7;

public class Main {
    static void main(String[] args) {

        Shop shop = new Shop();

        Order order1 = shop.createOrder(
                new OrderBuilder()
                        .addListOrder("Ноутбук")
                        .addListOrder("Мышка")
                        .addDiscount(10)
                        .addPayment("Оплата картой")
        );

        System.out.println(order1);

    }
}