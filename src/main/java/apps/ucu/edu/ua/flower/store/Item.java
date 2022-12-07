package apps.ucu.edu.ua.flower.store;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Item {
    private String descripton;
    public String getDescripton(){return descripton;}
    public abstract double price();

}
