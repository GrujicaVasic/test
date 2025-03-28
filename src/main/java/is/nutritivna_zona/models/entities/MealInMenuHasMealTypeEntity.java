package is.nutritivna_zona.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "meal_in_menu_has_meal_type")
public class MealInMenuHasMealTypeEntity {
    @EmbeddedId
    private MealInMenuHasMealTypeEntityId id;

    @MapsId("mealInMenuId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "meal_in_menu_id", nullable = false)
    private MealInMenuEntity mealInMenu;

    @MapsId("mealTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "meal_type_id", nullable = false)
    private MealTypeEntity mealTypeEntity;

}