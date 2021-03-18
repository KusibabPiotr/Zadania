package cleanCode.challenges.loty.repository;

import cleanCode.challenges.loty.entity.Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class SystemFlightsRepository implements FlightRepository{

    private final List<Flight> flightList = new ArrayList<>();

    {
        flightList.add(new Flight("Madrid","Moscow","Berlin",440,1500,1));
        flightList.add(new Flight("Cracow","London","",120,500,2));
        flightList.add(new Flight("Glasgow","Warsaw","",145,380,3));
        flightList.add(new Flight("Cracow","Barcelona","Vienna",360,1200,4));
        flightList.add(new Flight("London","Berlin","",100,300,5));
        flightList.add(new Flight("Madrid","Glasgow","",120,400,6));
        flightList.add(new Flight("Madrid","Warsaw","Berlin",180,600,7));
        flightList.add(new Flight("Cracow","Warsaw","",60,300,8));
        flightList.add(new Flight("Berlin","London","Vienna",360,500,9));
    }

    @Override
    public List<Flight> findFlights(Predicate <Flight> p) {
        return new CopyOnWriteArrayList<>(flightList)
                .stream()
                .filter(p)
                .collect(Collectors.toUnmodifiableList());
    }

}
