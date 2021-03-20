package cleanCode.challenges.zadanie2;

import cleanCode.challenges.zadanie2.entity.Customer;
import cleanCode.challenges.zadanie2.entity.CustomerOrderDto;
import cleanCode.challenges.zadanie2.entity.Product;
import cleanCode.challenges.zadanie2.repository.LocalOrderRepository;
import cleanCode.challenges.zadanie2.services.*;
import cleanCode.challenges.zadanie2.services.confirmation.EmailConfirmation;
import cleanCode.challenges.zadanie2.services.ShoppingCart;
import cleanCode.challenges.zadanie2.services.order.ProductOrderService;
import cleanCode.challenges.zadanie2.services.payment.PayPalPayment;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Piotr", "Kruk", "Gnojna 13", "511 234 235","PiotrKruk","kruku@o2.pl");
        Product product = new Product("Telewizor LG", "nowy niśmigany", 4999.99);
        Product product2 = new Product("Telewizor Sony", "stary zajechany", 1999.99);

        CustomerOrderDto orderRequest = ShoppingCart.addProductsToShoppingCart(customer,product,product2);

        ShoppingProcessor shoppingProcessor = new ShoppingProcessor
                (new EmailConfirmation(),new LocalOrderRepository(),new ProductOrderService(),new PayPalPayment());

        CustomerOrderDto customerOrderDto = shoppingProcessor.process(orderRequest);

        System.out.println("Shopping confirmed! Customer " + customerOrderDto.getCustomer() + " ordered: " + customerOrderDto.getOrder());


    }
}
