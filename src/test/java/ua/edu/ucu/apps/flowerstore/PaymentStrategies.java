package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flowerstore.flower.Payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.flowerstore.flower.Payment.PayPalPaymentStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaymentStrategyTest {
    @Test
    void testCreditCardPayment() {
        CreditCardPaymentStrategy payment = new CreditCardPaymentStrategy();
        assertEquals("paid with credit card", payment.getDescription());
    }

    @Test
    void testPayPalPayment() {
        PayPalPaymentStrategy payment = new PayPalPaymentStrategy();
        assertEquals("paid with credit card", payment.getDescription());
    }
}
