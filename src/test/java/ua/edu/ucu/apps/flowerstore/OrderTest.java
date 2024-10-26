package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flowerstore.flower.Item;
import ua.edu.ucu.apps.flowerstore.flower.Order;
import ua.edu.ucu.apps.flowerstore.flower.Delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.flowerstore.flower.Payment.PayPalPaymentStrategy;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class OrderTest {
    private Order order;
    private Item item;

    @BeforeEach
    void setUp() {
        order = new Order();
        item = mock(Item.class);
        when(item.getPrice()).thenReturn(100.0);
        order.addItem(item);
    }

    @Test
    void testCalculateTotalPrice() {
        assertEquals(100.0, order.calculateTotalPrice());
    }

    @Test
    void testSetPaymentStrategy() {
        PayPalPaymentStrategy payment = new PayPalPaymentStrategy();
        order.SetPaymentStrategy(payment);
        assertEquals(payment, order.getPayment());
    }

    @Test
    void testSetDeliveryStrategy() {
        DHLDeliveryStrategy delivery = new DHLDeliveryStrategy();
        order.SetDeliveryStrategy(delivery);
        assertEquals(delivery, order.getDelivery());
    }
}
