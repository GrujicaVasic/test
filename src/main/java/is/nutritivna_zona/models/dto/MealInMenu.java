package is.nutritivna_zona.models.dto;

import lombok.Data;

import java.util.List;

@Data
public class MealInMenu {
    private String mealName;
    private String mealDescription;
    private String menuName;
    private String menuType;
    private List<Ingredient> ingredients;
}
