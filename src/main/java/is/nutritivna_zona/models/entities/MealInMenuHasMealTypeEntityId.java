package is.nutritivna_zona.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class MealInMenuHasMealTypeEntityId implements java.io.Serializable {
    private static final long serialVersionUID = 8812842005036896174L;
    @NotNull
    @Column(name = "meal_in_menu_id", nullable = false)
    private Integer mealInMenuId;

    @NotNull
    @Column(name = "meal_type_id", nullable = false)
    private Integer mealTypeId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MealInMenuHasMealTypeEntityId entity = (MealInMenuHasMealTypeEntityId) o;
        return Objects.equals(this.mealTypeId, entity.mealTypeId) &&
                Objects.equals(this.mealInMenuId, entity.mealInMenuId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mealTypeId, mealInMenuId);
    }

}