package is.nutritivna_zona.services;

import is.nutritivna_zona.models.dto.Ingredient;

import java.util.Set;

public interface IngredientService {
    Set<Ingredient> findAll();
}
