package cleanCode.challenges.zadanie2.services;

import cleanCode.challenges.zadanie2.entity.Customer;
import cleanCode.challenges.zadanie2.entity.Order;
import cleanCode.challenges.zadanie2.entity.OrderDto;
import cleanCode.challenges.zadanie2.entity.Product;
import cleanCode.challenges.zadanie2.repository.OrderRepository;

public class ShoppingProcessor {

    private InformationService informationService;
    private OrderRepository orderRepository;
    private OrderService orderService;
    private PaymentService paymentService;

    public ShoppingProcessor(InformationService informationService, OrderRepository orderRepository,
                             OrderService orderService, PaymentService paymentService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
        this.paymentService = paymentService;
    }

    public OrderDto process(OrderRequest orderRequest){

        Order order = orderService.createOrder(orderRequest.getProducts());
        boolean isPaid = paymentService.pay(order);

        if (isPaid){
            orderRepository.save(order);
            informationService.successMessage();
        } else {
            informationService.errorMessage();
        }

        return new OrderDto(orderRequest.getCustomer(),isPaid,order);
    }
}
