package ua.edu.ucu.apps.flowerstore.flower;

import java.util.LinkedList;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.flowerstore.flower.Delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.flower.Payment.Payment;

@Getter @Setter
public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void SetPaymentStrategy(Payment paymentStrategy){
        this.payment = paymentStrategy;
    }

    public void SetDeliveryStrategy(Delivery deliveryStrategy){
        this.delivery = deliveryStrategy;
    }

    public double calculateTotalPrice(){
        double price = 0;
        for(Item item: items){
            price += item.getPrice();
        }
        return price;
    }

    public void processOrder(){
        payment.pay(calculateTotalPrice());
        delivery.deliver(items);
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }
}
