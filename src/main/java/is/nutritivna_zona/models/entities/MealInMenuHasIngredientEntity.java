package is.nutritivna_zona.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "meal_in_menu_has_ingredient")
public class MealInMenuHasIngredientEntity {
    @EmbeddedId
    private MealInMenuHasIngredientEntityId id;

    @MapsId("mealInMenuId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "meal_in_menu_id", nullable = false)
    private MealInMenuEntity mealInMenu;

    @MapsId("ingredientId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ingredient_id", nullable = false)
    private IngredientEntity ingredient;

}