package exception.flights;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FlightsSearchTest {

    private FlightsSearch flightsSearch = new FlightsSearch();

    @Test
    public void shouldReturnRouteNotFoundExceptionNotFoundDestinationAtAll(){
        //given
        Flight flight = new Flight("Cracow", "Lisbona");
        // when
        assertThatThrownBy(() -> flightsSearch.findFilght(flight))
                .isInstanceOf(RouteNotFoundException.class)
                .hasMessage("Flight to " + flight.getArrivalAirport() + " is NOT available AT ALL!");
    }

    @Test
    public void shouldReturnRouteNotFoundExceptionNoFlightsToDestination(){
        //given
        Flight flight = new Flight("Cracow", "Liverpool");
        // when
        assertThatThrownBy(() -> flightsSearch.findFilght(flight))
                .isInstanceOf(RouteNotFoundException.class)
                .hasMessage("Flight to " + flight.getArrivalAirport() + " is NOT available!");
    }

    @Test
    public void shouldReturnConfirmation(){
        //given
        Flight flight = new Flight("Cracow", "Glasgow");
        // when
        String message = flightsSearch.findFilght(flight);
        // then
        assertThat(message).isEqualTo("Flight to " + flight.getArrivalAirport() + " is available!");
    }

}