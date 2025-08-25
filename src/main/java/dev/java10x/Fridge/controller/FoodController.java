package dev.java10x.Fridge.controller;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Diz que tudo é um controler
@RequestMapping("/food") // Diz que você que vai mapear as rotas
public class FoodController {

    // injeção de dependecia, usar construtor ou @Autowired
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAll() {return foodService.getAll();}

    @PostMapping
    public Food create(@RequestBody Food food){ return foodService.save(food);}

}
