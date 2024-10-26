package ua.edu.ucu.apps.flowerstore.flower;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Flower extends Item{
    private FlowerColor color;
    private int sepalLenght;
    private double price;
    private FlowerType flowerType;
    private String description;

    public String getColor(){
        return color.ToString();
    }

    public Flower(){
        color = null;
        sepalLenght = 0;
        price = 0;
        flowerType = null;
        description = "";
    }

    public Flower(FlowerColor color, int sepal, FlowerType type, double price){
        this.color = color;
        sepalLenght = sepal;
        this.price = price;
        flowerType = type;
        description = String.format("%s flower with %d sepal lenght, %s type that costs %d", color, sepal, type, price);
    }

    public Flower(Flower flower){
        color = flower.color;
        sepalLenght = flower.sepalLenght;
        price = flower.price;
        flowerType = flower.flowerType;
    }
}
