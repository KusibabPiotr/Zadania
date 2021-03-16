package cleanCode.challenges.zadanie2.services;

import cleanCode.challenges.zadanie2.entity.Customer;
import cleanCode.challenges.zadanie2.entity.Order;
import cleanCode.challenges.zadanie2.entity.OrderDto;
import cleanCode.challenges.zadanie2.entity.Product;
import cleanCode.challenges.zadanie2.repository.Repository;

public class ShoppingProcessor {

    private InformationService informationService;
    private Repository<Order> orderRepository;
    private OrderService orderService;
    private PaymentService paymentService;

    public ShoppingProcessor(InformationService informationService, Repository<Order> orderRepository,
                             OrderService orderService, PaymentService paymentService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
        this.paymentService = paymentService;
    }

    public OrderDto process(Customer customer, Product ... products){

        Order order = orderService.createOrder(products);
        boolean isPaid = paymentService.pay(order);

        if (isPaid){
            orderRepository.save(order);
            informationService.successMessage();
        } else {
            informationService.errorMessage();
        }

        return new OrderDto(customer,isPaid,order);
    }
}
