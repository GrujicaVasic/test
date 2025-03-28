package is.nutritivna_zona.controllers;

import is.nutritivna_zona.models.MealSymptoms;
import is.nutritivna_zona.services.MealInFoodDiaryHasSymptomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/meals")
public class MealController {
    private final MealInFoodDiaryHasSymptomService mealInFoodDiaryHasSymptomService;

    public MealController(MealInFoodDiaryHasSymptomService mealInFoodDiaryHasSymptomService) {
        this.mealInFoodDiaryHasSymptomService = mealInFoodDiaryHasSymptomService;
    }

    @GetMapping
    public Set<MealSymptoms> findAll(){
        return mealInFoodDiaryHasSymptomService.findAll();
    }
}
