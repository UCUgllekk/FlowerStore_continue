package ua.edu.ucu.apps.flowerstore.flower.Payment;

import lombok.Getter;

@Getter
public class PayPalPaymentStrategy implements Payment{
    private String description;

    public PayPalPaymentStrategy(){
        description = "paid with credit card";
    }

    @Override
    public void pay(double price){
        System.out.println(String.format("You've %s $d gryvnas", description, price));
    }
}
