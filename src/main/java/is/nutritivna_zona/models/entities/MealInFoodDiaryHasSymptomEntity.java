package is.nutritivna_zona.models.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "meal_in_food_diary_has_symptom")
public class MealInFoodDiaryHasSymptomEntity {
    @EmbeddedId
    private MealInFoodDiaryHasSymptomEntityId id;

    @MapsId("mealInFoodDiaryId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "meal_in_food_diary_id", nullable = false)
    private MealInFoodDiaryEntity mealInFoodDiary;

    @MapsId("symptomId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "symptom_id", nullable = false)
    private is.nutritivna_zona.models.entities.SymptomEntity symptom;

}