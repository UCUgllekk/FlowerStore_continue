package ua.edu.ucu.apps.flowerstore.flower.Delivery;

import java.util.List;

import ua.edu.ucu.apps.flowerstore.flower.Item;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public void deliver(List<Item> itemList){
        for(Item item: itemList){
            System.out.println(String.format("%s was successfully delivered using DHL Delivery", item.getDescription()));
        }
        itemList.clear();
    }
}
