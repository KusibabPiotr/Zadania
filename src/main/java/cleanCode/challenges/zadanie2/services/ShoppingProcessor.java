package cleanCode.challenges.zadanie2.services;

import cleanCode.challenges.zadanie2.entity.Order;
import cleanCode.challenges.zadanie2.entity.CustomerOrderDto;
import cleanCode.challenges.zadanie2.repository.OrderRepository;
import cleanCode.challenges.zadanie2.services.confirmation.ConfirmationService;
import cleanCode.challenges.zadanie2.services.order.OrderService;
import cleanCode.challenges.zadanie2.services.payment.PaymentService;

public class ShoppingProcessor {

    private ConfirmationService confirmationService;
    private OrderRepository orderRepository;
    private OrderService orderService;
    private PaymentService paymentService;

    public ShoppingProcessor(ConfirmationService confirmationService, OrderRepository orderRepository,
                             OrderService orderService, PaymentService paymentService) {
        this.confirmationService = confirmationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
        this.paymentService = paymentService;
    }

    public CustomerOrderDto process(CustomerOrderDto orderRequest){

        Order order = orderService.createOrder(orderRequest.getOrder().getProducts());
        boolean isPaid = paymentService.pay(order);

        orderRepository.save(order);
        confirmationService.message(isPaid);

        return new CustomerOrderDto(orderRequest.getCustomer(),order);
    }
}
