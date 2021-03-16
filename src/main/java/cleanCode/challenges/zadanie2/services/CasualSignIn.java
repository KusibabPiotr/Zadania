package cleanCode.challenges.zadanie2.services;

import cleanCode.challenges.zadanie2.entity.Customer;

public class CasualSignIn implements SignInService{
    @Override
    public Customer signIn() {
        return new Customer("Piotr", "Kruk", "Kraków 13", "785785748");
    }
}
