package apps.ucu.edu.ua.flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower extends Item{
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
    public String getType() { return flowerType.toString(); }
    public Flower(double sepalLength, FlowerColor color, double price, FlowerType flowerType){
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = flowerType;
    }
    public Flower(){
        this.sepalLength = 0;
        this.color = null;
        this.price = 0;
        this.flowerType = null;
    }

    @Override
    public double price() {
        return price;
    }
}
