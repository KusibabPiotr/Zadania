package cleanCode.challenges.loty.repository;

import cleanCode.challenges.loty.entity.Flight;

import java.util.List;
import java.util.function.Predicate;

public interface FlightRepository {

    List<Flight> findFlights(Predicate <Flight> p);

}
