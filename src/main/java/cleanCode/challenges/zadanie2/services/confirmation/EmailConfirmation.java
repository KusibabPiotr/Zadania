package cleanCode.challenges.zadanie2.services.confirmation;

public class EmailConfirmation implements ConfirmationService {

    @Override
    public void message(boolean isPaid) {
        if (isPaid){
            System.out.println("Shopping success! You will receive confirmation message to your email!\n");
        }else {
            System.out.println("Shopping failed! You will receive message to your email with information what goes wrong!\n");
        }
    }
}
