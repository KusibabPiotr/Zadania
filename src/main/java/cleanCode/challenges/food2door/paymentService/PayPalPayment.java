package cleanCode.challenges.food2door.paymentService;

import cleanCode.challenges.food2door.entities.Producer;

public class PayPalPayment implements PaymentService{
    @Override
    public boolean pay(Producer producer) {
        System.out.println("Transfering money to " + producer.getName());
        System.out.println("Account number: " + producer.getBankAccountNumber());
        System.out.println("Transaction completed");
        return true;
    }
}
