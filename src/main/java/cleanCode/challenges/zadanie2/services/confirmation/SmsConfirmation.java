package cleanCode.challenges.zadanie2.services.confirmation;

public class SmsConfirmation implements ConfirmationService{

    @Override
    public void message(boolean isPaid) {
        if (isPaid){
            System.out.println("Shopping success! You will receive confirmation message to your email!");
        }else {
            System.out.println("Shopping failed! You will receive message to your email with information what goes wrong!");
        }
    }

}
