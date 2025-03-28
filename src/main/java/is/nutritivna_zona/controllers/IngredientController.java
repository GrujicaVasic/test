package is.nutritivna_zona.controllers;

import is.nutritivna_zona.models.dto.Ingredient;
import is.nutritivna_zona.services.IngredientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping
    public Set<Ingredient> findAll() { return ingredientService.findAll(); }
}
