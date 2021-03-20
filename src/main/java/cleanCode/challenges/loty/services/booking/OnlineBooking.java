package cleanCode.challenges.loty.services.booking;

import cleanCode.challenges.loty.entity.Flight;
import cleanCode.challenges.loty.repository.FlightRepository;
import java.util.List;
import java.util.Scanner;

public final class OnlineBooking implements BookingService {

    private final FlightRepository flightRepository;

    public OnlineBooking(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public List<Flight> searchForFlight(String airport, FlightAirport selectionType) {

        if (selectionType.equals(FlightAirport.FROM)){
            return flightRepository.findFlights(e -> e.getDepartureAirport().equals(airport));
        }else if (selectionType.equals(FlightAirport.BY)) {
            return flightRepository.findFlights(e -> e.getIndirectAirport().equals(airport));
        } else {
            return flightRepository.findFlights(e -> e.getArrivalAirport().equals(airport));
        }

    }

    @Override
    public Flight bookYourFlight(List<Flight> flights) {

        System.out.println("Pick your flight:");
        flights.forEach(e -> System.out.println("Flight id - " + e.getIdNumber() + " >> " + e + " <<"));
        Scanner sc = new Scanner(System.in);

        int flightNumber;
        do {
            flightNumber = sc.nextInt();
        }while (flightNumber<1 && flightNumber>=flights.size());

        int finalFlightNumber = flightNumber;
        Flight flight = flights.stream().filter(e -> e.getIdNumber() == finalFlightNumber).findFirst().get();

        System.out.println("Flight " + flight + " has been booked succesfully!");
        return flight;
    }

}
