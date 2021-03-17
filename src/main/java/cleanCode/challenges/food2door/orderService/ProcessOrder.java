package cleanCode.challenges.food2door.orderService;

import cleanCode.challenges.food2door.entities.Order;
import cleanCode.challenges.food2door.entities.OrderProducerDto;
import cleanCode.challenges.food2door.entities.Producer;
import cleanCode.challenges.food2door.entities.Status;
import cleanCode.challenges.food2door.orderService.OrderService;
import cleanCode.challenges.food2door.paymentService.PaymentService;

public final class ProcessOrder {

    private final Producer producer;
    private final PaymentService paymentService;
    private final OrderService orderService;

    public ProcessOrder(final Producer producer,final PaymentService paymentService,final OrderService orderService) {
        this.producer = producer;
        this.paymentService = paymentService;
        this.orderService = orderService;
    }

    public OrderProducerDto process() {

        Order order = createOrder();
        boolean isConfirmed = orderService.placeOrder(order);
        order = order.changeOrderStatusToSent();

        if (isConfirmed){
            if(paymentService.pay(producer)){
                order = order.changeOrderStatusToPaid();
            }
        }
        return new OrderProducerDto(producer,order);
    }

    private Order createOrder() {

        return new Order(producer, producer.getProduct(), Status.CREATED);
    }

}
