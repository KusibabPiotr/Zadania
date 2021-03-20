package cleanCode.challenges.loty.entity;

public final class Flight {

    private final String departureAirport;
    private final String arrivalAirport;
    private final String indirectAirport;
    private final int flightTimeMinutes;
    private final double price;
    private final int idNumber;

    public Flight(String departureAirport, String arrivalAirport,String indirectAirport, int flightTimeMinutes, double price,int idNumber) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.indirectAirport = indirectAirport;
        this.flightTimeMinutes = flightTimeMinutes;
        this.price = price;
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getIndirectAirport() {
        return indirectAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public int getFlightTimeMinutes() {
        return flightTimeMinutes;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return departureAirport + " - " + indirectAirport + " - " + arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (flightTimeMinutes != flight.flightTimeMinutes) return false;
        if (Double.compare(flight.price, price) != 0) return false;
        if (departureAirport != null ? !departureAirport.equals(flight.departureAirport) : flight.departureAirport != null)
            return false;
        return arrivalAirport != null ? arrivalAirport.equals(flight.arrivalAirport) : flight.arrivalAirport == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = departureAirport != null ? departureAirport.hashCode() : 0;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + flightTimeMinutes;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
