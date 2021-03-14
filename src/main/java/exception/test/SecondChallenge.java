package exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws CustomException {
        if(x >= 2 || x < 1 || y == 1.5) {
            throw new CustomException("One of conditions failed - EXCEPTION!");
        }
        return "Done!";
    }
}