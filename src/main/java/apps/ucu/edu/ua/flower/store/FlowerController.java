package apps.ucu.edu.ua.flower.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/flowers")
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers(){
        return List.of(
                new Flower(5.5, FlowerColor.RED,60, FlowerType.ROSE),
                new Flower(7.5, FlowerColor.BLUE, 20, FlowerType.TULIP),
                new Flower(3, FlowerColor.WHITE, 10, FlowerType.CHAMOMILE));
    }

}
