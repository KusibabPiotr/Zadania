package cleanCode.challenges.zadanie2.services.payment;

import cleanCode.challenges.zadanie2.entity.Order;

public interface PaymentService {

    boolean pay(Order order);
}
