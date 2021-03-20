package cleanCode.challenges.food2door.entities;

import cleanCode.challenges.food2door.entities.Order;
import cleanCode.challenges.food2door.entities.Producer;

public final class OrderProducerDto {

    private final Producer producer;
    private final Order order;

    public OrderProducerDto(Producer producer, Order order) {
        this.producer = producer;
        this.order = order;
    }

    public Producer getProducer() {
        return producer;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "Waiting for receive order from: " +producer.getName() + ". We oreded: " + order + "\n";
    }
}
