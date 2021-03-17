package cleanCode.challenges.zadanie2.repository;

import cleanCode.challenges.zadanie2.entity.Order;

import java.util.List;

public interface OrderRepository {

    List<Order> findAll();
    void save(Order order);

}
