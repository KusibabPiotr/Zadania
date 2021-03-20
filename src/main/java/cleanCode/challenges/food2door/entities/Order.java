package cleanCode.challenges.food2door.entities;

public class Order {

    private final Producer producer;
    private final Product product;
    private final Status orderStatus;

    public Order(Producer producer, Product product, Status orderStatus) {
        this.producer = producer;
        this.product = product;
        this.orderStatus = orderStatus;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }

    public Status getOrderStatus() {
        return orderStatus;
    }

    public Order changeOrderStatusToPaid(){
        return new Order(producer, product, Status.PAID);
    }

    public Order changeOrderStatusToSent(){
        return new Order(producer, product, Status.SENT);
    }

    @Override
    public String toString() {
        return "product=" + product.getName() +
                ", quantity: " + product.getQuantity() +
                ", orderStatus=" + orderStatus +
                ' ';
    }
}
