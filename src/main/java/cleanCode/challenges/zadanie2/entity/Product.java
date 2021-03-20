package cleanCode.challenges.zadanie2.entity;

public final class Product {

    private final String name;
    private final String description;
    private final double price;

    public Product(final String name,final String description,final double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}
