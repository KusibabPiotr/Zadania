package exception.flights;

public class App {

    public static void main(String[] args) {

        FlightsSearch flightsSearch = new FlightsSearch();
        Flight flight = new Flight("Kraków", "Birmingham");

        try {
            String result = flightsSearch.findFilght(flight);
            System.out.println(result);

        } catch (RouteNotFoundException e) {
            System.err.println(e.getMessage());
        }

    }
}
