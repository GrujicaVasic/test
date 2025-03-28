package is.nutritivna_zona.services;

import is.nutritivna_zona.models.MealSymptoms;

import java.util.Set;

public interface MealInFoodDiaryHasSymptomService {
    Set<MealSymptoms> findAll();
}
