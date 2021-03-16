package cleanCode.challenges.zadanie2.services;

import cleanCode.challenges.zadanie2.entity.Customer;
import cleanCode.challenges.zadanie2.entity.Order;
import cleanCode.challenges.zadanie2.entity.Product;
import cleanCode.challenges.zadanie2.services.OrderService;

public class ProductOrderService implements OrderService {

    @Override
    public Order createOrder(Product... products) {
        System.out.println("Order created");
        System.out.println("Products added to order");
        return new Order(products);
    }

}
