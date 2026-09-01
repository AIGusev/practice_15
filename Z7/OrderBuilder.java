package practice_15.Z7;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    List<String> listOrder = new ArrayList<>();
    double discount = 0;
    String payment = "Оплата картой";

    public List<String> getListOrder() {
        return listOrder;
    }

    public double getDiscount() {
        return discount;
    }

    public String getPayment() {
        return payment;
    }

    public OrderBuilder addListOrder(String listOrder) {
        this.listOrder.add(listOrder);
        return this;
    }

    public OrderBuilder addDiscount(double discount) {
        this.discount = discount;
        return this;
    }

    public OrderBuilder addPayment(String payment) {
        this.payment = payment;
        return this;
    }

    public Order build() {
        return new Order(this);


    }
}
