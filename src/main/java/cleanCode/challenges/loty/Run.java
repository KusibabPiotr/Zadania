package cleanCode.challenges.loty;

import cleanCode.challenges.loty.repository.SystemFlightsRepository;
import cleanCode.challenges.loty.services.BookingProcessor;
import cleanCode.challenges.loty.services.booking.FlightAirport;
import cleanCode.challenges.loty.services.booking.OnlineBooking;
import cleanCode.challenges.loty.services.payment.PayPalPayment;

public class Run {
    public static void main(String[] args) {

        BookingProcessor processor = new BookingProcessor(new OnlineBooking(new SystemFlightsRepository()), new PayPalPayment());


        processor.process(FlightAirport.FROM, "Cracow");
    }
}
