package practice_15.Z7;

public class Shop {

    public Order createOrder(OrderBuilder builder) {
        return builder.build();
    }

    public Order createDefaultOrder() {
        return new OrderBuilder()
                .addListOrder("Товар по умолчанию")
                .build();
    }
}