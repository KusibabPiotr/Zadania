package cleanCode.challenges.loty.services;

import cleanCode.challenges.loty.entity.Flight;
import cleanCode.challenges.loty.services.booking.BookingService;
import cleanCode.challenges.loty.services.booking.FlightAirport;
import cleanCode.challenges.loty.services.payment.PaymentService;
import java.util.List;

public class BookingProcessor {

    private final BookingService bookingService;
    private final PaymentService paymentService;

    public BookingProcessor(BookingService bookingService, PaymentService paymentService) {
        this.bookingService = bookingService;
        this.paymentService = paymentService;
    }

    public void process(FlightAirport selectionType, String airport){

        List<Flight> flights = bookingService.searchForFlight(airport,selectionType);

        if (flights.size() > 0){
            Flight flight = bookingService.bookYourFlight(flights);
            paymentService.pay(flight);
        } else {
            System.out.println("No avalaible flights " + selectionType.toString() + " " + airport);
        }
    }


}
