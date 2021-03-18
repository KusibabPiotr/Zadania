package cleanCode.challenges.loty.services.booking;

import cleanCode.challenges.loty.entity.Flight;

import java.util.List;
import java.util.Scanner;

public interface BookingService {

//    List<Flight> searchForFlightByAirport(String airport);
//
//    List<Flight> searchForFlightFromAirport(String airport);

    List<Flight> searchForFlight(String airport, FlightAirport type);

    Flight bookYourFlight(List<Flight> flights);
}
