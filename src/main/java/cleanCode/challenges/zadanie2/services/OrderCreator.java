package cleanCode.challenges.zadanie2.services;

import cleanCode.challenges.zadanie2.entity.Customer;
import cleanCode.challenges.zadanie2.entity.Product;

public class OrderCreator {

    public OrderRequest createOrder(Customer customer){
        Product product = new Product("Telewizor LG", "nowy niśmigany", 4999.99);
        Product product2 = new Product("Telewizor Sony", "stary zajechany", 1999.99);
        return new OrderRequest(customer,product,product2);
    }
}
