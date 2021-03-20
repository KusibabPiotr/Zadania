package cleanCode.challenges.zadanie2.services.order;

import cleanCode.challenges.zadanie2.entity.Customer;
import cleanCode.challenges.zadanie2.entity.Order;
import cleanCode.challenges.zadanie2.entity.Product;

import java.util.List;

public interface OrderService {

    Order createOrder(List<Product> products);

}
