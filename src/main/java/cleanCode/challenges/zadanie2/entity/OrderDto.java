package cleanCode.challenges.zadanie2.entity;

import cleanCode.challenges.zadanie2.entity.Order;

public final class OrderDto {

    private final Customer customer;
    private final boolean isSucceded;
    private final Order order;

    public OrderDto(Customer customer, boolean isSucceded, Order order) {
        this.customer = customer;
        this.isSucceded = isSucceded;
        this.order = order;
    }

    public boolean isSucceded() {
        return isSucceded;
    }

    public Order getOrder() {
        return order;
    }

    public Customer getCustomer() {
        return customer;
    }
}
