package cleanCode.challenges.zadanie2.services;

import cleanCode.challenges.zadanie2.entity.Customer;
import cleanCode.challenges.zadanie2.entity.Order;
import cleanCode.challenges.zadanie2.entity.Product;

public interface OrderService {

    Order createOrder(Product ... products);

}
