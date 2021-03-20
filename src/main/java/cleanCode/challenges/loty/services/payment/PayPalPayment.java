package cleanCode.challenges.loty.services.payment;

import cleanCode.challenges.loty.entity.Flight;

public class PayPalPayment implements PaymentService{

    @Override
    public boolean pay(Flight flight) {
        System.out.println("PayPal transaction for the amount " +flight.getPrice() + " zł for flight " + flight + " completed succesfully");
        return true;
    }
}
