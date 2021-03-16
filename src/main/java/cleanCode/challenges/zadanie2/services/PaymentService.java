package cleanCode.challenges.zadanie2.services;

import cleanCode.challenges.zadanie2.entity.Order;

public interface PaymentService {

    boolean pay(Order order);
}
