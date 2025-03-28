package is.nutritivna_zona.controllers;

import is.nutritivna_zona.models.FoodDiary;
import is.nutritivna_zona.services.FoodDiaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/diaries")
public class FoodDiaryController {
    private final FoodDiaryService foodDiaryService;

    public FoodDiaryController(FoodDiaryService foodDiaryService) {
        this.foodDiaryService = foodDiaryService;
    }

    @GetMapping
    public List<FoodDiary> findAll() {
        return foodDiaryService.findAll();
    }
}
