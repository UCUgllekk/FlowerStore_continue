package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstore.flower.Item;
import ua.edu.ucu.apps.flowerstore.flower.Delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.flowerstore.flower.Delivery.PastDeliveryStrategy;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class DeliveryStrategyTest {
    @Test
    void testDHLDelivery() {
        List<Item> items = new LinkedList<>();
        Item item = mock(Item.class);
        items.add(item);
        DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();
        delivery.deliver(items);
        verify(item).getDescription();
    }

    @Test
    void testPastDelivery() {
        List<Item> items = new LinkedList<>();
        Item item = mock(Item.class);
        items.add(item);
        PastDeliveryStrategy delivery = new PastDeliveryStrategy();
        delivery.deliver(items);
        verify(item).getDescription();
    }
}
