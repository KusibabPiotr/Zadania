package cleanCode.challenges.zadanie2.services.order;

import cleanCode.challenges.zadanie2.entity.Order;
import cleanCode.challenges.zadanie2.entity.Product;
import cleanCode.challenges.zadanie2.services.order.OrderService;

import java.util.List;

public class ProductOrderService implements OrderService {

    @Override
    public Order createOrder(List<Product> products) {

        System.out.println("Order confirmed with products: ");
        products.forEach(System.out::println);
        System.out.println("\n");

        return new Order(products);
    }

}
