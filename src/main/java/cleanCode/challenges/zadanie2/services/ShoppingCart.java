package cleanCode.challenges.zadanie2.services;

import cleanCode.challenges.zadanie2.entity.Customer;
import cleanCode.challenges.zadanie2.entity.Order;
import cleanCode.challenges.zadanie2.entity.CustomerOrderDto;
import cleanCode.challenges.zadanie2.entity.Product;

import java.util.List;

public class ShoppingCart {

    public static CustomerOrderDto addProductsToShoppingCart(Customer customer, Product ... products){

        List<Product> productList = List.of(products);

        System.out.println("You added to shopping cart: ");
        productList.forEach(System.out::println);
        System.out.println("\n");

        return new CustomerOrderDto(customer, new Order(productList));
    }
}
