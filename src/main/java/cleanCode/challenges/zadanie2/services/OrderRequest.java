package cleanCode.challenges.zadanie2.services;

import cleanCode.challenges.zadanie2.entity.Customer;
import cleanCode.challenges.zadanie2.entity.Product;

public final class OrderRequest {

    private final Customer customer;
    private final Product[] products;

    public OrderRequest(Customer customer, Product ... products) {
        this.customer = customer;
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product[] getProducts() {
        return products;
    }
}
