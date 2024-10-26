package ua.edu.ucu.apps.flowerstore.flower;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class FlowerService {

    @GetMapping("flower")
	public List<Flower> getFlowers(){
		return List.of(new Flower(FlowerColor.RED, 100, FlowerType.CHAMOMILE, 100));
	}
	
}
