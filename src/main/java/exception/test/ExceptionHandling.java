package exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2,3);
        } catch (CustomException e){
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Something else goes wrong!");
        } finally {
            System.out.println("Will be execute any way!");
        }
    }
}
