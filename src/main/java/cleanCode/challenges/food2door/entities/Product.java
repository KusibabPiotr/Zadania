package cleanCode.challenges.food2door.entities;

public final class Product {

    private final String name;
    private final int quantity;

    public Product(final String name,final int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
