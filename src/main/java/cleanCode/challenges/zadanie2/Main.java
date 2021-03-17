package cleanCode.challenges.zadanie2;

import cleanCode.challenges.zadanie2.entity.Customer;
import cleanCode.challenges.zadanie2.entity.OrderDto;
import cleanCode.challenges.zadanie2.entity.Product;
import cleanCode.challenges.zadanie2.repository.LocalOrderOrderRepository;
import cleanCode.challenges.zadanie2.services.*;

public class Main {

    public static void main(String[] args) {

        CasualSignIn casualSignIn = new CasualSignIn();
        Customer customer = casualSignIn.signIn();

        OrderRequest orderRequest = new OrderCreator().createOrder(customer);

        ShoppingProcessor shoppingProcessor = new ShoppingProcessor
                (new EmailInformation(),new LocalOrderOrderRepository(),new ProductOrderService(),new PayPalPayment());

        OrderDto orderDto = shoppingProcessor.process(orderRequest);

        System.out.println("Customer " + orderDto.getCustomer() + "Order: " + orderDto.getOrder() + " is succeded: " + orderDto.isSucceded());


    }
}
