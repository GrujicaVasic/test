package is.nutritivna_zona.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Data
@Getter
@Setter
@Embeddable
public class MealInFoodDiaryHasSymptomEntityId implements java.io.Serializable {
    private static final long serialVersionUID = 4139507868716885422L;
    @NotNull
    @Column(name = "meal_in_food_diary_id", nullable = false)
    private Integer mealInFoodDiaryId;

    @NotNull
    @Column(name = "symptom_id", nullable = false)
    private Integer symptomId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MealInFoodDiaryHasSymptomEntityId entity = (MealInFoodDiaryHasSymptomEntityId) o;
        return Objects.equals(this.mealInFoodDiaryId, entity.mealInFoodDiaryId) &&
                Objects.equals(this.symptomId, entity.symptomId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mealInFoodDiaryId, symptomId);
    }

}