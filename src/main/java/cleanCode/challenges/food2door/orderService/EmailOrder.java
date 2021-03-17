package cleanCode.challenges.food2door.orderService;

import cleanCode.challenges.food2door.entities.Order;
import cleanCode.challenges.food2door.entities.OrderProducerDto;

public class EmailOrder implements OrderService{
    @Override
    public boolean placeOrder(Order order) {
        System.out.println("Created new order. It contains: " + order);
        System.out.println("Order was send to " + order.getProducer().getName() + " to email address: " + order.getProducer().getEmail());
        return true;
    }
}
