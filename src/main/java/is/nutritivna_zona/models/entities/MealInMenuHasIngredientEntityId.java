package is.nutritivna_zona.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class MealInMenuHasIngredientEntityId implements java.io.Serializable {
    private static final long serialVersionUID = -3252279136072646656L;
    @NotNull
    @Column(name = "meal_in_menu_id", nullable = false)
    private Integer mealInMenuId;

    @NotNull
    @Column(name = "ingredient_id", nullable = false)
    private Integer ingredientId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MealInMenuHasIngredientEntityId entity = (MealInMenuHasIngredientEntityId) o;
        return Objects.equals(this.ingredientId, entity.ingredientId) &&
                Objects.equals(this.mealInMenuId, entity.mealInMenuId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredientId, mealInMenuId);
    }

}