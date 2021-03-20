package cleanCode.challenges.zadanie2.entity;

import cleanCode.challenges.zadanie2.entity.Order;

public final class CustomerOrderDto {

    private final Customer customer;
    private final Order order;

    public CustomerOrderDto(Customer customer, Order order) {
        this.customer = customer;
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public Customer getCustomer() {
        return customer;
    }
}
