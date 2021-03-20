package cleanCode.challenges.food2door.paymentService;

import cleanCode.challenges.food2door.entities.Producer;

public class BankPayment implements PaymentService {

    @Override
    public boolean pay(Producer producer) {
        System.out.println("Transfering money to " + producer.getName());
        System.out.println("PayPal account name: " + producer.getPayPalAccount());
        System.out.println("Transaction completed");
        return true;
    }
}
