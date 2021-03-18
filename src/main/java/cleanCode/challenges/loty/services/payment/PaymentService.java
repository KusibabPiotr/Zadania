package cleanCode.challenges.loty.services.payment;

import cleanCode.challenges.loty.entity.Flight;

public interface PaymentService {

    boolean pay(Flight flight);
}
