package exception.flights;

public class RouteNotFoundException extends RuntimeException{

    public RouteNotFoundException(String message) {
        super(message);
    }

    public RouteNotFoundException() {
    }
}
