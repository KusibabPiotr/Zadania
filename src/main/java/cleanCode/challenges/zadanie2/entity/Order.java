package cleanCode.challenges.zadanie2.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class Order {

    private final List <Product> products;

    public Order(Product ... products) {
        this.products = new CopyOnWriteArrayList<>(Arrays.asList(products));
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "products=" + products +
                '}';
    }
}
