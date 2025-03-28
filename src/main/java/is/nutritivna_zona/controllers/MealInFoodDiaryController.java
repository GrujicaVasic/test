package is.nutritivna_zona.controllers;


import is.nutritivna_zona.models.DiaryMealSymptoms;
import is.nutritivna_zona.models.MealInFoodDiary;
import is.nutritivna_zona.services.MealInFoodDiaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/fd-meals")
public class MealInFoodDiaryController {
    private final MealInFoodDiaryService mealInFoodDiaryService;

    public MealInFoodDiaryController(MealInFoodDiaryService mealInFoodDiaryService) {
        this.mealInFoodDiaryService = mealInFoodDiaryService;
    }

    @GetMapping
    public List<MealInFoodDiary> findAll() {
        return mealInFoodDiaryService.findAll(MealInFoodDiary.class);
    }
}
