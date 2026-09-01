package practice_15.Z7;

import java.lang.module.ModuleDescriptor;
import java.util.List;

public class Order {
    List<String> listOrder;
    double discount;
    String payment;

    public Order(OrderBuilder builder) {
        this.listOrder = builder.listOrder;
        this.discount = builder.discount;
        this.payment = builder.payment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "listOrder=" + listOrder +
                ", discount=" + discount +
                ", payment='" + payment + '\'' +
                '}';
    }
}

