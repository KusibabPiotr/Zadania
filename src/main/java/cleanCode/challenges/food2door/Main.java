package cleanCode.challenges.food2door;

import cleanCode.challenges.food2door.entities.Producer;
import cleanCode.challenges.food2door.entities.Product;
import cleanCode.challenges.food2door.orderService.EmailOrder;
import cleanCode.challenges.food2door.orderService.ProcessOrder;
import cleanCode.challenges.food2door.orderService.TraditionalOrder;
import cleanCode.challenges.food2door.paymentService.BankPayment;
import cleanCode.challenges.food2door.paymentService.CashPayment;
import cleanCode.challenges.food2door.paymentService.PayPalPayment;

public class Main {
    public static void main(String[] args) {

        Producer producer = new Producer("ExtraFoodShop", "Gnojna 13", "756234123", "4454 6765 5454 4532","ExtraFoodShop@op.pl",new Product("Organiczne jabłka", 1000),"ExtraFoodShopPAYPAL");
        Producer producer2 = new Producer("HealthyShop", "Dymna 131", "733876765","4454 9999 5454 7676","HealthyShop@op.pl", new Product("Organiczne super gruszki", 1500),"HealthyShopPAYPAL");
        Producer producer3 = new Producer("GlutenFreeShop", "Stara 19", "512765278","4454 6567 5454 8776","GlutenFreeShop@onet.pl", new Product("Naturalne Grzybki", 500),"GlutenFreeShopPAYPAL");

        ProcessOrder processOrder = new ProcessOrder(producer,new BankPayment(),new EmailOrder());
        System.out.println(processOrder.process().toString());

        ProcessOrder processOrder2 = new ProcessOrder(producer2,new PayPalPayment(),new TraditionalOrder());
        System.out.println(processOrder2.process().toString());

        ProcessOrder processOrder3 = new ProcessOrder(producer3,new CashPayment(),new EmailOrder());
        System.out.println(processOrder3.process().toString());
    }
}
