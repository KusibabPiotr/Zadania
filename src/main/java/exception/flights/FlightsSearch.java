package exception.flights;

import java.util.HashMap;
import java.util.Map;

public class FlightsSearch {

    private final Map <String, Boolean> map = new HashMap<>();
    {
        Map<String, Boolean> flights = Map.ofEntries(Map.entry("Birmingham", true),
                Map.entry("London", false),
                Map.entry("Glasgow", true),
                Map.entry("West Midlands", true),
                Map.entry("Liverpool", false));
        map.putAll(flights);
    }

    public Map<String,Boolean> getMap(){
        return map;
    }

    String findFilght(Flight flight) throws RouteNotFoundException {
        String arrivalAirport = flight.getArrivalAirport();

        if (map.containsKey(arrivalAirport)){

            if (map.get(arrivalAirport)) {
                return "Flight to " + arrivalAirport + " is available!";
            }else {
                throw new RouteNotFoundException("Flight to " + arrivalAirport + " is NOT available!");
            }

        }else {
            throw new RouteNotFoundException("Flight to " + arrivalAirport + " is NOT available AT ALL!");
        }
    }
}
