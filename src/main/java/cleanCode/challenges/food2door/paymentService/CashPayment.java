package cleanCode.challenges.food2door.paymentService;

import cleanCode.challenges.food2door.entities.Producer;

public class CashPayment implements PaymentService {

    @Override
    public boolean pay(Producer producer) {
        System.out.println("Money will be paid to the supplier upon delivery");
        return false;
    }
}
