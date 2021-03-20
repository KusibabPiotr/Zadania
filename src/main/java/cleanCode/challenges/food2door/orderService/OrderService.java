package cleanCode.challenges.food2door.orderService;

import cleanCode.challenges.food2door.entities.Order;
import cleanCode.challenges.food2door.entities.OrderProducerDto;

public interface OrderService {

    boolean placeOrder(Order order);
}
