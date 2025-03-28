package is.nutritivna_zona.controllers;

import is.nutritivna_zona.models.dto.MealInMenu;
import is.nutritivna_zona.services.MealInMenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/menu-meals")
public class MealInMenuController {
    private final MealInMenuService mealInMenuService;

    public MealInMenuController(MealInMenuService mealInMenuService) {
        this.mealInMenuService = mealInMenuService;
    }

    @GetMapping
    public Set<MealInMenu> findAll() {
        return mealInMenuService.findAll();
    }
}
