package cleanCode.challenges.zadanie2;

import cleanCode.challenges.zadanie2.entity.Customer;
import cleanCode.challenges.zadanie2.entity.Order;
import cleanCode.challenges.zadanie2.entity.OrderDto;
import cleanCode.challenges.zadanie2.entity.Product;
import cleanCode.challenges.zadanie2.repository.OrderRepository;
import cleanCode.challenges.zadanie2.services.*;

public class Main {

    public static void main(String[] args) {

        CasualSignIn casualSignIn = new CasualSignIn();
        Customer customer = casualSignIn.signIn();

        Product product = new Product("Telewizor LG", "nowy niśmigany", 4999.99);
        Product product2 = new Product("Telewizor Sony", "stary zajechany", 1999.99);

        ShoppingProcessor shoppingProcessor = new ShoppingProcessor
                (new EmailInformation(),new OrderRepository(),new ProductOrderService(),new PayPalPayment());

        OrderDto orderDto = shoppingProcessor.process(customer,product,product2);

        System.out.println("Customer " + orderDto.getCustomer() + "Order: " + orderDto.getOrder() + " is succeded: " + orderDto.isSucceded());


    }
}
