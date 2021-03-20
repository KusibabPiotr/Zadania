package cleanCode.challenges.zadanie2.services.payment;

import cleanCode.challenges.zadanie2.entity.Order;
import cleanCode.challenges.zadanie2.services.payment.PaymentService;

public class PayPalPayment implements PaymentService {
    @Override
    public boolean pay(Order order) {
        System.out.println("Payment successful! \n");
        return true;
    }
}
