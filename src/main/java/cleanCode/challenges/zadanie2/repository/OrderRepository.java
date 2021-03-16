package cleanCode.challenges.zadanie2.repository;

import cleanCode.challenges.zadanie2.entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class OrderRepository implements Repository<Order> {

    private final List<Order> orders = new ArrayList<>();

    @Override
    public List<Order> findAll() {
        return new CopyOnWriteArrayList<>(orders);
    }

    @Override
    public void save(Order order) {
        orders.add(order);
        System.out.println("Saved data about order in repository!");
    }
}
