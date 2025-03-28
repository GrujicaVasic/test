package is.nutritivna_zona.services;

import is.nutritivna_zona.models.dto.MealInMenu;

import java.util.Set;

public interface MealInMenuService {
    Set<MealInMenu> findAll();
}
