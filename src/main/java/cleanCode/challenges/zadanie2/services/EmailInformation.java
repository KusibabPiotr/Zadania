package cleanCode.challenges.zadanie2.services;

import cleanCode.challenges.zadanie2.services.InformationService;

public class EmailInformation implements InformationService {

    @Override
    public void successMessage() {
        System.out.println("Shopping success! You will receive confirmation message to your email!");
    }

    @Override
    public void errorMessage() {
        System.out.println("Shopping failed! You will receive message to your email with information what goes wrong!");
    }
}
