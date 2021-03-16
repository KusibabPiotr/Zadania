package cleanCode.challenges.zadanie2.services;

import cleanCode.challenges.zadanie2.entity.Order;

public class PayPalPayment implements PaymentService{
    @Override
    public boolean pay(Order order) {
        System.out.println("Payment successful");
        return true;
    }
}
