package ua.edu.ucu.apps.flowerstore;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flowerstore.flower.Flower;
import ua.edu.ucu.apps.flowerstore.flower.FlowerColor;
import ua.edu.ucu.apps.flowerstore.flower.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    @Test
    void testFlowerConstructorAndMethods() {
        Flower flower = new Flower(FlowerColor.RED, 10, FlowerType.ROSE, 20.0);
        assertEquals(FlowerColor.RED, flower.getColor());
        assertEquals(10, flower.getSepalLenght());
        assertEquals(20.0, flower.getPrice());
        assertEquals(FlowerType.ROSE, flower.getFlowerType());
    }
}
