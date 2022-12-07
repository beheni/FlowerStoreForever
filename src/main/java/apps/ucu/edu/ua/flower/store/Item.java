package apps.ucu.edu.ua.flower.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Item {
    private String description;
    private double price;
    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return this.price;
    }
}
